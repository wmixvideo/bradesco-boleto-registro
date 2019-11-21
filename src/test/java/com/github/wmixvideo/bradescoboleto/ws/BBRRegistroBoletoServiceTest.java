package com.github.wmixvideo.bradescoboleto.ws;

import org.junit.Test;

import com.github.wmixvideo.bradescoboleto.classes.BBRRegistroEntradaBoleto;
import com.github.wmixvideo.bradescoboleto.classes.BBRRegistroRetornoBoleto;
import com.google.gson.Gson;

import junit.framework.Assert;

public class BBRRegistroBoletoServiceTest {

    @Test
    public void testRegistroEntradaParaJson() {
        final String dadosEntradaJson = new Gson().toJson(new BBRRegistroEntradaBoleto());
        final String json = "{\"nuCPFCNPJ\":\"0\",\"filialCPFCNPJ\":\"0\",\"ctrlCPFCNPJ\":\"0\",\"cdTipoAcesso\":\"2\",\"clubBanco\":\"2269651\",\"cdTipoContrato\":\"48\",\"nuSequenciaContrato\":\"0\",\"idProduto\":\"0\",\"nuNegociacao\":\"0\",\"cdBanco\":\"237\",\"eNuSequenciaContrato\":\"0\",\"tpRegistro\":\"1\",\"cdProduto\":\"0\",\"nuTitulo\":\"0\",\"nuCliente\":\"\",\"dtEmissaoTitulo\":\"\",\"dtVencimentoTitulo\":\"\",\"tpVencimento\":\"0\",\"vlNominalTitulo\":\"0\",\"cdEspecieTitulo\":\"0\",\"tpProtestoAutomaticoNegativacao\":\"0\",\"prazoProtestoAutomaticoNegativacao\":\"0\",\"controleParticipante\":\"\",\"cdPagamentoParcial\":\"\",\"qtdePagamentoParcial\":\"0\",\"percentualJuros\":\"0\",\"vlJuros\":\"0\",\"qtdeDiasJuros\":\"0\",\"percentualMulta\":\"0\",\"vlMulta\":\"0\",\"qtdeDiasMulta\":\"0\",\"percentualDesconto1\":\"0\",\"vlDesconto1\":\"0\",\"dataLimiteDesconto1\":\"\",\"percentualDesconto2\":\"0\",\"vlDesconto2\":\"0\",\"dataLimiteDesconto2\":\"\",\"percentualDesconto3\":\"0\",\"vlDesconto3\":\"0\",\"dataLimiteDesconto3\":\"\",\"prazoBonificacao\":\"0\",\"percentualBonificacao\":\"0\",\"vlBonificacao\":\"0\",\"dtLimiteBonificacao\":\"\",\"vlAbatimento\":\"0\",\"vlIOF\":\"0\",\"nomePagador\":\"\",\"logradouroPagador\":\"\",\"nuLogradouroPagador\":\"\",\"complementoLogradouroPagador\":\"\",\"cepPagador\":\"0\",\"complementoCepPagador\":\"0\",\"bairroPagador\":\"\",\"municipioPagador\":\"\",\"ufPagador\":\"\",\"cdIndCpfcnpjPagador\":\"0\",\"nuCpfcnpjPagador\":\"0\",\"endEletronicoPagador\":\"\",\"nomeSacadorAvalista\":\"\",\"logradouroSacadorAvalista\":\"\",\"nuLogradouroSacadorAvalista\":\"\",\"complementoLogradouroSacadorAvalista\":\"\",\"cepSacadorAvalista\":\"0\",\"complementoCepSacadorAvalista\":\"0\",\"bairroSacadorAvalista\":\"\",\"municipioSacadorAvalista\":\"\",\"ufSacadorAvalista\":\"\",\"cdIndCpfcnpjSacadorAvalista\":\"0\",\"nuCpfcnpjSacadorAvalista\":\"0\",\"endEletronicoSacadorAvalista\":\"\"}";
        Assert.assertEquals(json, dadosEntradaJson);
    }

    @Test
    public void testJsonParaRegistroEntrada() {
        final BBRRegistroRetornoBoleto registroBoleto = new BBRRegistroRetornoBoleto().setCdErro("5");
        final BBRRegistroRetornoBoleto objetoComVirgula = BBRRegistroBoletoService.converterJsonToRegistroRetorno("{\"cdErro\":\"5\", }");
        final BBRRegistroRetornoBoleto objetoSemVirgula = BBRRegistroBoletoService.converterJsonToRegistroRetorno("{\"cdErro\":\"5\" }");
        Assert.assertEquals(registroBoleto.toString(), objetoComVirgula.toString());
        Assert.assertEquals(registroBoleto.toString(), objetoSemVirgula.toString());
    }

}
