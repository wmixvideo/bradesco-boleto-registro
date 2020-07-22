package com.github.wmixvideo.bradescoboleto;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class BBRUtilTest {

    @Test
    public void formataData() {
        final LocalDate localDate = LocalDate.of(2017, 8, 23);
        Assert.assertEquals("23.08.2017", BBRUtil.formataData(Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()), true, "Teste data"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formataDataObrigatoriaNula() {
        Assert.assertEquals("", BBRUtil.formataData(null, true, "Teste data"));
    }

    @Test
    public void formataDataNaoObrigatoriaNula() {
        Assert.assertEquals("", BBRUtil.formataData(null, false, "Teste data"));
    }

    @Test
    public void formataValor() {
        Assert.assertEquals("10000", BBRUtil.formataValor(new BigDecimal("100"), true, "Teste Valor"));
        Assert.assertEquals("10005", BBRUtil.formataValor(new BigDecimal("100.05"), true, "Teste Valor"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formataValorObrigatoriaNula() {
        Assert.assertEquals("", BBRUtil.formataValor(null, true, "Teste Valor"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formataValorObrigatoriaComTextoInvalido() {
        Assert.assertEquals("", BBRUtil.formataString("'(", 15,true, "Teste Valor",true));
    }

    @Test
    public void formataValorNaoObrigatoriaNula() {
        Assert.assertEquals("0", BBRUtil.formataValor(null, false, "Teste Valor"));
    }

    @Test
    public void formataPercentual() {
        Assert.assertEquals("00500000", BBRUtil.formataPercentual(new BigDecimal("5"), true, "Teste Percentual"));
        Assert.assertEquals("00555000", BBRUtil.formataPercentual(new BigDecimal("5.55"), true, "Teste Percentual"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formataPercentualObrigatoriaNula() {
        Assert.assertEquals("", BBRUtil.formataPercentual(null, true, "Teste Percentual"));
    }

    @Test
    public void formataPercentualNaoObrigatoriaNula() {
        Assert.assertEquals("0", BBRUtil.formataPercentual(null, false, "Teste Percentual"));
    }

    @Test
    public void formataTextoSomenteNumeros() {
        Assert.assertEquals("123", BBRUtil.formataStringApenasNumeros("TESTE123", 4, true, "Teste Texto", true));
        Assert.assertEquals("12345", BBRUtil.formataStringApenasNumeros("T1E2S3TE456", 5, true, "Teste Texto", true));
    }

    @Test
    public void formataTexto() {
        Assert.assertEquals("TEST", BBRUtil.formataString("TESTE", 4, true, "Teste Texto", true));
        Assert.assertEquals("TESTE", BBRUtil.formataString("TESTE", 15, false, "Teste Texto", true));
        Assert.assertEquals("Acentuacao e caracteres invalidos .,", BBRUtil.formataString("Acentuação e caracteres inválidos @.,'", 40, true, "Teste limite maximo", false));
        Assert.assertEquals("Acentuacao e caracteres invalidos .,-", BBRUtil.formataString("Acentuação e caracteres inválidos @.,[]{}()_-'", 40, true, "Teste limite maximo", false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formataTextoObrigatoriaNula() {
        Assert.assertEquals("", BBRUtil.formataString("", 0, true, "Teste Texto", true));
        Assert.assertEquals("", BBRUtil.formataString(null, 0, true, "Teste Texto", true));
    }

    @Test
    public void formataTextoNaoObrigatoriaNula() {
        Assert.assertEquals("", BBRUtil.formataString(null, 0, true, "Teste Texto", false));
    }

    @Test
    public void formataTextoRemoveCaracteresEspeciais(){
        Assert.assertEquals("dagua", BBRUtil.removeCaracteresEspeciais("d'agua"));
        Assert.assertEquals("Endereco complementar", BBRUtil.removeCaracteresEspeciais("Endereco (complementar)"));
        Assert.assertEquals("Endereco .,", BBRUtil.removeCaracteresEspeciais("Endereço (.,)"));
    }

    @Test
    public void formataTextoLimiteMaximo() {
        Assert.assertEquals("012345678901234", BBRUtil.formataString("01234567890123456789", 15, true, "Teste limite maximo", false));
        Assert.assertEquals("TESTE", BBRUtil.formataString("TESTE", 15, true, "Teste limite maximo", false));
        Assert.assertEquals("Acentuacao", BBRUtil.formataString("Acentuação", 15, true, "Teste limite maximo", false));
        Assert.assertEquals("012345678901234", BBRUtil.formataString("012345678901234'", 15, true, "Teste limite maximo", false));
    }

    @Test
    public void formataEmail(){
        Assert.assertEquals("teste@teste.com.br", BBRUtil.formataEmail("teste@teste.com.br", 40, true, "Teste limite maximo", false));
        Assert.assertEquals("teste123@teste.com.br", BBRUtil.formataEmail("teste123@teste.com.br", 40, true, "Teste limite maximo", false));
        Assert.assertEquals("", BBRUtil.formataEmail(null, 40, true, "Teste limite maximo", false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaEmailInvalido(){
        Assert.assertEquals("teste1teste.com.br", BBRUtil.formataEmail("teste1teste.com.br", 40, true, "Teste limite maximo", false));
    }
}