package com.github.wmixvideo.ws;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import com.github.wmixvideo.BBRConfig;
import com.github.wmixvideo.classes.RegistroEntradaBoleto;
import com.github.wmixvideo.classes.RegistroRetornoBoleto;
import com.google.gson.Gson;

public class WSRegistroBoleto {

    public RegistroRetornoBoleto enviarBoleto(final BBRConfig config, final RegistroEntradaBoleto registroEntrada) throws Exception {
        final Gson gson = new Gson();
        final byte[] dadosEntrada = Base64.decodeBase64(gson.toJson(registroEntrada).getBytes());

        final HttpURLConnection connection = (HttpURLConnection) new URL(config.getAmbiente().getUrl()).openConnection();
        try {
            final KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(config.getCertificadoKeyStore(), config.getCertificadoSenha().toCharArray());

            final SSLContext sc = SSLContext.getInstance(config.getSSLProtocolo());
            sc.init(kmf.getKeyManagers(), null, new SecureRandom());

            ((HttpsURLConnection) connection).setSSLSocketFactory(sc.getSocketFactory());
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            try (OutputStream out = connection.getOutputStream()) {
                out.write(dadosEntrada);
                out.flush();
            }
            ByteArrayOutputStream os;
            try (InputStream is = connection.getInputStream()) {
                os = new ByteArrayOutputStream();
                int b;
                while ((b = is.read()) != -1) {
                    os.write(b);
                }
            }
            System.out.println(new String(os.toByteArray()));
            return gson.fromJson(new String(Base64.decodeBase64(IOUtils.toString(connection.getInputStream(), "UTF-8").getBytes())), RegistroRetornoBoleto.class);
        } finally {
            connection.disconnect();
        }
    }
}