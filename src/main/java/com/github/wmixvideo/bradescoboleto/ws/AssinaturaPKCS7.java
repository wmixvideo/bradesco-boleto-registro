package com.github.wmixvideo.bradescoboleto.ws;

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.CMSTypedData;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Store;

public final class AssinaturaPKCS7 {
    private static final String SIGNATUREALGO = "Sha256WithRSA";

    public static CMSSignedDataGenerator setUpProvider(final KeyStore keystore, final char[] senha) throws Exception {
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
        final Store certstore = new JcaCertStore(certlist);
        final Certificate cert = keystore.getCertificate(aliaz);
        final ContentSigner signer = new JcaContentSignerBuilder(AssinaturaPKCS7.SIGNATUREALGO).setProvider("BC").build((PrivateKey) (keystore.getKey(aliaz, senha)));
        final CMSSignedDataGenerator generator = new CMSSignedDataGenerator();
        generator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().setProvider("BC").build()).build(signer, (X509Certificate) cert));
        generator.addCertificates(certstore);
        return generator;
    }

    static byte[] signPkcs7(final byte[] content, final CMSSignedDataGenerator generator) throws Exception {
        final CMSTypedData cmsdata = new CMSProcessableByteArray(content);
        final CMSSignedData signeddata = generator.generate(cmsdata, true);
        return signeddata.getEncoded();
    }
}