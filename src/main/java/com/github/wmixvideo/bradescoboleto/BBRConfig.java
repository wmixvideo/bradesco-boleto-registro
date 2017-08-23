package com.github.wmixvideo.bradescoboleto;

import java.security.KeyStore;
import java.security.KeyStoreException;

public abstract class BBRConfig {

    /**
     * Indica o ambiente de trabalho, se em produção ou homologação.
     * @return Ambiente de trabalho.
     */
    public BBRAmbiente getAmbiente() {
        return BBRAmbiente.HOMOLOGACAO;
    }

    /**
     * KeyStore contendo o certificado pessoal do emissor. <br>
     * Esse certificado é fornecido por uma autoridade certificadora. <br>
     * Em caso de dúvidas, consulte seu contador.
     * @return KeyStore do certificado pessoal.
     * @throws KeyStoreException Caso não consiga carregar o KeyStore.
     */
    public abstract KeyStore getCertificadoKeyStore() throws KeyStoreException;

    /**
     * Senha do certificado pessoal do emissor, contido dentro do KeyStore do certificado.
     * @return Senha do certificado.
     * @see #getCertificadoKeyStore()
     */
    public abstract String getCertificadoSenha();

    /**
     * KeyStore contendo a cadeia de certificados da SEFAZ de destino. <br>
     * Para gerar a cadeia, use o utilitário fornecido com a biblioteca:<br>
     * FileUtils.writeByteArrayToFile(new File("/tmp/producao.cacerts"), NFGeraCadeiaCertificados.geraCadeiaCertificados(NFAmbiente.PRODUCAO, "senha"));
     * @return KeyStore da cadeia de certificados.
     * @throws KeyStoreException Caso nao consiga carregar o KeyStore.
     */
    public abstract KeyStore getCadeiaCertificadosKeyStore() throws KeyStoreException;

    /**
     * Senha da cadeia de certificados, contida dentro do KeyStore da cadeia.
     * @return Senha da cadeia de certificados.
     * @see #getCadeiaCertificadosKeyStore()
     */
    public abstract String getCadeiaCertificadosSenha();

    /**
     * Protocolo de SSL, usado pelo Bradesco para receber as notas.
     * @return Protocolo SSL do Bradesco boleto Registro Online de origem.
     */
    public String getSSLProtocolo() {
        return "TLSv1.2";
    }
}