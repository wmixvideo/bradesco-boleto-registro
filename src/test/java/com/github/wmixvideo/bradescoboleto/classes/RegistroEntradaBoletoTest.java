package com.github.wmixvideo.bradescoboleto.classes;

import org.junit.Assert;
import org.junit.Test;

public class RegistroEntradaBoletoTest {

    @Test
    public void testCamposFixos() {
        final RegistroEntradaBoleto registro = new RegistroEntradaBoleto();
        Assert.assertEquals("2", registro.getCdTipoAcesso());
        Assert.assertEquals("2269651", registro.getClubBanco());
        Assert.assertEquals("48", registro.getCdTipoContrato());
        Assert.assertEquals("237", registro.getCdBanco());
        Assert.assertEquals("1", registro.getTpRegistro());
        Assert.assertEquals("0", registro.getTpVencimento());
    }

    @Test
    public void testDadosCnpj() {
        final RegistroEntradaBoleto registro = new RegistroEntradaBoleto().setNuCPFCNPJ("12345678123456");
        Assert.assertEquals("012345678", registro.getNuCPFCNPJ());
        Assert.assertEquals("1234", registro.getFilialCPFCNPJ());
        Assert.assertEquals("56", registro.getCtrlCPFCNPJ());
    }

    @Test
    public void testDadosCpf() {
        final RegistroEntradaBoleto registro = new RegistroEntradaBoleto().setNuCPFCNPJ("12345678912");
        Assert.assertEquals("123456789", registro.getNuCPFCNPJ());
        Assert.assertEquals("0", registro.getFilialCPFCNPJ());
        Assert.assertEquals("12", registro.getCtrlCPFCNPJ());
    }

    public void testCepPagador() {
        final RegistroEntradaBoleto registro = new RegistroEntradaBoleto().setCepPagador("88101250");
        Assert.assertEquals("88101", registro.getCepPagador());
        Assert.assertEquals("250", registro.getComplementoCepPagador());
    }

    public void testCpfcnpjPagador() {
        final RegistroEntradaBoleto registro = new RegistroEntradaBoleto().setNuCpfcnpjPagador("12345678912");
        Assert.assertEquals("00012345678912", registro.getNuCpfcnpjPagador());
        Assert.assertEquals("2", registro.getCdIndCpfcnpjPagador());
        final RegistroEntradaBoleto registro2 = new RegistroEntradaBoleto().setNuCpfcnpjPagador("12312345678912");
        Assert.assertEquals("12312345678912", registro2.getNuCpfcnpjPagador());
        Assert.assertEquals("1", registro2.getCdIndCpfcnpjPagador());
    }

}
