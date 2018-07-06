package com.github.wmixvideo.bradescoboleto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

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
    public void formataTexto() {
        Assert.assertEquals("TEST", BBRUtil.formataString("TESTE", 4, true, "Teste Texto", true));
        Assert.assertEquals("TESTE", BBRUtil.formataString("TESTE", 15, false, "Teste Texto", true));
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
    public void formataTextoRemoveAcentuacao(){
        Assert.assertEquals("aaaaaeeeeiiiioooouuuuncyrsnpwgnmuxzh",BBRUtil.removeAcentuacao("àáäâãèéëêìíïîòóöôùúüûñçÿŕśńṕẃǵǹḿǘẍźḧ"));
    }

    @Test
    public void formataTextoRemoveCaracteresEspeciais(){
        Assert.assertEquals("dagua", BBRUtil.removeCaracteresEspeciais("d'agua"));
        Assert.assertEquals("Endereco complementar", BBRUtil.removeCaracteresEspeciais("Endereco (complementar)"));
    }

    @Test
    public void formataTextoLimiteMaximo() {
        Assert.assertEquals("012345678901234", BBRUtil.formataString("01234567890123456789", 15, true, "Teste limite maximo", false));
        Assert.assertEquals("TESTE", BBRUtil.formataString("TESTE", 15, true, "Teste limite maximo", false));
        Assert.assertEquals("Acentuacao", BBRUtil.formataString("Acentuação", 15, true, "Teste limite maximo", false));
        Assert.assertEquals("012345678901234", BBRUtil.formataString("012345678901234'", 15, true, "Teste limite maximo", false));
    }

}