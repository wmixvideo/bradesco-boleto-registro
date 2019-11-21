package com.github.wmixvideo.bradescoboleto.ws;

import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

final class BBRPKCS7 {
    private static final String SIGNATUREALGO = "Sha256WithRSA";

    static CMSSignedDataGenerator setUpProvider(final KeyStore keystore, final char[] senha) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        final Enumeration<String> aliases = keystore.aliases();
        String aliaz = "";
        while (aliases.hasMoreElements()) {
            aliaz = aliases.nextElement();
            if (keystore.isKeyEntry(aliaz)) {
                break;
            }
        }
        final Certificate[] certchain = keystore.getCertificateChain(aliaz);
        final List<Certificate> certlist = new ArrayList<>();
        for (int i = 0, length = certchain == null ? 0 : certchain.length; i < length; i++) {
            certlist.add(certchain[i]);
        }
        final Certificate cert = keystore.getCertificate(aliaz);
        final ContentSigner signer = new JcaContentSignerBuilder(BBRPKCS7.SIGNATUREALGO).setProvider("BC").build((PrivateKey) (keystore.getKey(aliaz, senha)));
        final CMSSignedDataGenerator generator = new CMSSignedDataGenerator();
        generator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().setProvider("BC").build()).build(signer, (X509Certificate) cert));
        generator.addCertificates(new JcaCertStore(certlist));
        return generator;
    }

    static byte[] signPkcs7(final CMSSignedDataGenerator generator, final byte[] content) throws Exception {
        return generator.generate(new CMSProcessableByteArray(content), true).getEncoded();
    }
}