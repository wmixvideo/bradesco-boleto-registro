package com.github.wmixvideo.bradescoboleto.ws;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.bouncycastle.cms.CMSSignedDataGenerator;

import com.github.wmixvideo.bradescoboleto.BBRConfig;
import com.github.wmixvideo.bradescoboleto.BBRLoggable;
import com.github.wmixvideo.bradescoboleto.classes.RegistroEntradaBoleto;
import com.github.wmixvideo.bradescoboleto.classes.RegistroRetornoBoleto;
import com.google.gson.Gson;

public class WSRegistroBoleto implements BBRLoggable {

    public RegistroRetornoBoleto enviarBoleto(final BBRConfig config, final RegistroEntradaBoleto registroEntrada) throws Exception {
        final String dadosEntradaJson = new Gson().toJson(registroEntrada);
        this.getLogger().debug("Dados para registro: {}", dadosEntradaJson);

        final String dadoEntradaAssinadoBase64 = this.geraArquivoAssinadoBase64(config, dadosEntradaJson);
        this.getLogger().debug("Dados assinados para registro: {}", dadoEntradaAssinadoBase64);

        final SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(new BBRSocketFactory(config).getContext());
        try (final CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslSocketFactory).build()) {
            final HttpPost request = new HttpPost(config.getAmbiente().getUrl());
            request.setHeader("Content-Type", "application/pkcs7-signature");
            request.setEntity(new StringEntity(dadoEntradaAssinadoBase64));

            final HttpResponse response = httpClient.execute(request);
            this.getLogger().debug("Response status: {}", response.getStatusLine().getStatusCode());
            final String stringResposta = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8);
            this.getLogger().debug("Resposta string: {}", stringResposta);
            final Matcher m = Pattern.compile("<return>(.+?)</return>", Pattern.CASE_INSENSITIVE).matcher(stringResposta);
            final String respostaJson = m.find() ? m.group(1) : "";
            this.getLogger().debug("Resposta json: {}", respostaJson);
            return WSRegistroBoleto.converterJsonToRegistroRetorno(respostaJson);
        }
    }

    static RegistroRetornoBoleto converterJsonToRegistroRetorno(final String respostaJson) {
        final String respostaJsonLimpa = respostaJson.substring(respostaJson.lastIndexOf(",") + 1).trim().equals("}") ? respostaJson.substring(0, respostaJson.lastIndexOf(",")) + "}" : respostaJson;
        return new Gson().fromJson(respostaJsonLimpa, RegistroRetornoBoleto.class);
    }

    public String geraArquivoAssinadoBase64(final BBRConfig config, final String dadosEntradaJson) throws Exception {
        final CMSSignedDataGenerator signatureGenerator = AssinaturaPKCS7.setUpProvider(config.getCertificadoKeyStore(), config.getCertificadoSenha().toCharArray());
        final byte[] signedBytes = AssinaturaPKCS7.signPkcs7(signatureGenerator, dadosEntradaJson.getBytes("UTF-8"));
        return new String(org.bouncycastle.util.encoders.Base64.encode(signedBytes));
    }
}