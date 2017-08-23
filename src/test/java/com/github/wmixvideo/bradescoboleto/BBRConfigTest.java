package com.github.wmixvideo.bradescoboleto;

import java.security.KeyStore;
import java.security.KeyStoreException;

import org.junit.Test;

import com.github.wmixvideo.bradescoboleto.BBRConfig;

import junit.framework.Assert;

public class BBRConfigTest {

    @Test
    public void testaParametrosPadrao() {
        final BBRConfigTeste config = new BBRConfigTeste();
        Assert.assertEquals("TLSv1.2", config.getSSLProtocolo());
    }

    private class BBRConfigTeste extends BBRConfig {

        @Override
        public KeyStore getCertificadoKeyStore() throws KeyStoreException {
            return null;
        }

        @Override
        public String getCertificadoSenha() {
            return null;
        }

        @Override
        public KeyStore getCadeiaCertificadosKeyStore() throws KeyStoreException {
            return null;
        }

        @Override
        public String getCadeiaCertificadosSenha() {
            return null;
        }
    }

}
