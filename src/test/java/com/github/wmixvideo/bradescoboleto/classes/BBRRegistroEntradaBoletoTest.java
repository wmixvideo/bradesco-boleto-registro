package com.github.wmixvideo.bradescoboleto.classes;

import org.junit.Assert;
import org.junit.Test;

public class BBRRegistroEntradaBoletoTest {

    @Test
    public void testCamposFixos() {
        final BBRRegistroEntradaBoleto registro = new BBRRegistroEntradaBoleto();
        Assert.assertEquals("2", registro.getCdTipoAcesso());
        Assert.assertEquals("2269651", registro.getClubBanco());
        Assert.assertEquals("48", registro.getCdTipoContrato());
        Assert.assertEquals("237", registro.getCdBanco());
        Assert.assertEquals("1", registro.getTpRegistro());
        Assert.assertEquals("0", registro.getTpVencimento());
    }

    @Test
    public void testDadosCnpj() {
        final BBRRegistroEntradaBoleto registro = new BBRRegistroEntradaBoleto().setNuCPFCNPJ("12345678123456");
        Assert.assertEquals("012345678", registro.getNuCPFCNPJ());
        Assert.assertEquals("1234", registro.getFilialCPFCNPJ());
        Assert.assertEquals("56", registro.getCtrlCPFCNPJ());
    }

    @Test
    public void testDadosCpf() {
        final BBRRegistroEntradaBoleto registro = new BBRRegistroEntradaBoleto().setNuCPFCNPJ("12345678912");
        Assert.assertEquals("123456789", registro.getNuCPFCNPJ());
        Assert.assertEquals("0", registro.getFilialCPFCNPJ());
        Assert.assertEquals("12", registro.getCtrlCPFCNPJ());
    }

    @Test
    public void testCepPagador() {
        final BBRRegistroEntradaBoleto registro = new BBRRegistroEntradaBoleto().setCepPagador("88101250");
        Assert.assertEquals("88101", registro.getCepPagador());
        Assert.assertEquals("250", registro.getComplementoCepPagador());
    }

    @Test
    public void testCpfcnpjPagador() {
        final BBRRegistroEntradaBoleto registro = new BBRRegistroEntradaBoleto().setNuCpfcnpjPagador("12345678912");
        Assert.assertEquals("00012345678912", registro.getNuCpfcnpjPagador());
        Assert.assertEquals("1", registro.getCdIndCpfcnpjPagador());
        final BBRRegistroEntradaBoleto registro2 = new BBRRegistroEntradaBoleto().setNuCpfcnpjPagador("12312345678912");
        Assert.assertEquals("12312345678912", registro2.getNuCpfcnpjPagador());
        Assert.assertEquals("2", registro2.getCdIndCpfcnpjPagador());
    }

}
