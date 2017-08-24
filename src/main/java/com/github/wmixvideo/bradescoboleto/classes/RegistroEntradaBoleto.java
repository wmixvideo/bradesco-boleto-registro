package com.github.wmixvideo.bradescoboleto.classes;

public class RegistroEntradaBoleto {

    private String nuCPFCNPJ;
    private String filialCPFCNPJ;
    private String ctrlCPFCNPJ;
    private String cdTipoAcesso;
    private String clubBanco;
    private String cdTipoContrato;
    private String nuSequenciaContrato;
    private String idProduto;
    private String nuNegociacao;
    private String cdBanco;
    private String eNuSequenciaContrato;
    private String tpRegistro;
    private String cdProduto;
    private String nuTitulo;
    private String nuCliente;
    private String dtEmissaoTitulo;
    private String dtVencimentoTitulo;
    private String tpVencimento;
    private String vlNominalTitulo;
    private String cdEspecieTitulo;
    private String tpProtestoAutomaticoNegativacao;
    private String prazoProtestoAutomaticoNegativacao;
    private String controleParticipante;
    private String cdPagamentoParcial;
    private String qtdePagamentoParcial;
    private String percentualJuros;
    private String vlJuros;
    private String qtdeDiasJuros;
    private String percentualMulta;
    private String vlMulta;
    private String qtdeDiasMulta;
    private String percentualDesconto1;
    private String vlDesconto1;
    private String dataLimiteDesconto1;
    private String percentualDesconto2;
    private String vlDesconto2;
    private String dataLimiteDesconto2;
    private String percentualDesconto3;
    private String vlDesconto3;
    private String dataLimiteDesconto3;
    private String prazoBonificacao;
    private String percentualBonificacao;
    private String vlBonificacao;
    private String dtLimiteBonificacao;
    private String vlAbatimento;
    private String vlIOF;
    private String nomePagador;
    private String logradouroPagador;
    private String nuLogradouroPagador;
    private String complementoLogradouroPagador;
    private String cepPagador;
    private String complementoCepPagador;
    private String bairroPagador;
    private String municipioPagador;
    private String ufPagador;
    private String cdIndCpfcnpjPagador;
    private String nuCpfcnpjPagador;
    private String endEletronicoPagador;
    private String nomeSacadorAvalista;
    private String logradouroSacadorAvalista;
    private String nuLogradouroSacadorAvalista;
    private String complementoLogradouroSacadorAvalista;
    private String cepSacadorAvalista;
    private String complementoCepSacadorAvalista;
    private String bairroSacadorAvalista;
    private String municipioSacadorAvalista;
    private String ufSacadorAvalista;
    private String cdIndCpfcnpjSacadorAvalista;
    private String nuCpfcnpjSacadorAvalista;
    private String endEletronicoSacadorAvalista;

    public RegistroEntradaBoleto() {
        this.preencherCampos();
    }

    public void preencherCampos() {
        this.cdTipoAcesso = "2";
        this.clubBanco = "2269651";
        this.cdTipoContrato = "48";
        this.cdBanco = "237";
        this.tpRegistro = "1";
        this.tpVencimento = "0";
        this.nuCPFCNPJ = "0";
        this.filialCPFCNPJ = "0";
        this.ctrlCPFCNPJ = "0";
        this.nuSequenciaContrato = "0";
        this.idProduto = "0";
        this.nuNegociacao = "0";
        this.eNuSequenciaContrato = "0";
        this.cdProduto = "0";
        this.nuTitulo = "0";
        this.nuCliente = "";
        this.dtEmissaoTitulo = "";
        this.dtVencimentoTitulo = "";
        this.vlNominalTitulo = "0";
        this.cdEspecieTitulo = "0";
        this.tpProtestoAutomaticoNegativacao = "0";
        this.prazoProtestoAutomaticoNegativacao = "0";
        this.controleParticipante = "";
        this.cdPagamentoParcial = "";
        this.qtdePagamentoParcial = "0";
        this.percentualJuros = "0";
        this.vlJuros = "0";
        this.qtdeDiasJuros = "0";
        this.percentualMulta = "0";
        this.vlMulta = "0";
        this.qtdeDiasMulta = "0";
        this.percentualDesconto1 = "0";
        this.vlDesconto1 = "0";
        this.dataLimiteDesconto1 = "";
        this.percentualDesconto2 = "0";
        this.vlDesconto2 = "0";
        this.dataLimiteDesconto2 = "";
        this.percentualDesconto3 = "0";
        this.vlDesconto3 = "0";
        this.dataLimiteDesconto3 = "";
        this.percentualBonificacao = "0";
        this.prazoBonificacao = "0";
        this.vlBonificacao = "0";
        this.dtLimiteBonificacao = "";
        this.vlAbatimento = "0";
        this.vlIOF = "0";
        this.nomePagador = "";
        this.logradouroPagador = "";
        this.nuLogradouroPagador = "";
        this.complementoLogradouroPagador = "";
        this.cepPagador = "0";
        this.complementoCepPagador = "0";
        this.bairroPagador = "";
        this.municipioPagador = "";
        this.ufPagador = "";
        this.cdIndCpfcnpjPagador = "0";
        this.nuCpfcnpjPagador = "0";
        this.endEletronicoPagador = "";
        this.nomeSacadorAvalista = "";
        this.logradouroSacadorAvalista = "";
        this.nuLogradouroSacadorAvalista = "";
        this.complementoLogradouroSacadorAvalista = "";
        this.cepSacadorAvalista = "0";
        this.complementoCepSacadorAvalista = "0";
        this.bairroSacadorAvalista = "";
        this.municipioSacadorAvalista = "";
        this.ufSacadorAvalista = "";
        this.cdIndCpfcnpjSacadorAvalista = "0";
        this.nuCpfcnpjSacadorAvalista = "0";
        this.endEletronicoSacadorAvalista = "";
    }

    public RegistroEntradaBoleto setNuCPFCNPJ(final String nuCPFCNPJ) {
        this.nuCPFCNPJ = nuCPFCNPJ.length() == 14 ? String.format("0%s", nuCPFCNPJ.substring(0, 8)) : nuCPFCNPJ.substring(0, 9);
        this.filialCPFCNPJ = nuCPFCNPJ.length() == 14 ? nuCPFCNPJ.substring(8, 12) : "0";
        this.ctrlCPFCNPJ = nuCPFCNPJ.substring(nuCPFCNPJ.length() - 2, nuCPFCNPJ.length());
        return this;
    }

    public RegistroEntradaBoleto setNuSequenciaContrato(final String nuSequenciaContrato) {
        this.nuSequenciaContrato = nuSequenciaContrato;
        return this;
    }

    public RegistroEntradaBoleto setIdProduto(final String idProduto) {
        this.idProduto = idProduto;
        return this;
    }

    public RegistroEntradaBoleto setNuNegociacao(final String nuNegociacao) {
        this.nuNegociacao = nuNegociacao;
        return this;
    }

    public RegistroEntradaBoleto setCdBanco(final String cdBanco) {
        this.cdBanco = cdBanco;
        return this;
    }

    public RegistroEntradaBoleto seteNuSequenciaContrato(final String eNuSequenciaContrato) {
        this.eNuSequenciaContrato = eNuSequenciaContrato;
        return this;
    }

    public RegistroEntradaBoleto setTpRegistro(final String tpRegistro) {
        this.tpRegistro = tpRegistro;
        return this;
    }

    public RegistroEntradaBoleto setCdProduto(final String cdProduto) {
        this.cdProduto = cdProduto;
        return this;
    }

    public RegistroEntradaBoleto setNuTitulo(final String nuTitulo) {
        this.nuTitulo = nuTitulo;
        return this;
    }

    public RegistroEntradaBoleto setNuCliente(final String nuCliente) {
        this.nuCliente = nuCliente;
        return this;
    }

    public RegistroEntradaBoleto setDtEmissaoTitulo(final String dtEmissaoTitulo) {
        this.dtEmissaoTitulo = dtEmissaoTitulo;
        return this;
    }

    public RegistroEntradaBoleto setDtVencimentoTitulo(final String dtVencimentoTitulo) {
        this.dtVencimentoTitulo = dtVencimentoTitulo;
        return this;
    }

    public RegistroEntradaBoleto setVlNominalTitulo(final String vlNominalTitulo) {
        this.vlNominalTitulo = vlNominalTitulo;
        return this;
    }

    public RegistroEntradaBoleto setCdEspecieTitulo(final String cdEspecieTitulo) {
        this.cdEspecieTitulo = cdEspecieTitulo;
        return this;
    }

    public RegistroEntradaBoleto setTpProtestoAutomaticoNegativacao(final String tpProtestoAutomaticoNegativacao) {
        this.tpProtestoAutomaticoNegativacao = tpProtestoAutomaticoNegativacao;
        return this;
    }

    public RegistroEntradaBoleto setPrazoProtestoAutomaticoNegativacao(final String prazoProtestoAutomaticoNegativacao) {
        this.prazoProtestoAutomaticoNegativacao = prazoProtestoAutomaticoNegativacao;
        return this;
    }

    public RegistroEntradaBoleto setControleParticipante(final String controleParticipante) {
        this.controleParticipante = controleParticipante;
        return this;
    }

    public RegistroEntradaBoleto setCdPagamentoParcial(final String cdPagamentoParcial) {
        this.cdPagamentoParcial = cdPagamentoParcial;
        return this;
    }

    public RegistroEntradaBoleto setQtdePagamentoParcial(final String qtdePagamentoParcial) {
        this.qtdePagamentoParcial = qtdePagamentoParcial;
        return this;
    }

    public RegistroEntradaBoleto setPercentualJuros(final String percentualJuros) {
        this.percentualJuros = percentualJuros;
        return this;
    }

    public RegistroEntradaBoleto setVlJuros(final String vlJuros) {
        this.vlJuros = vlJuros;
        return this;
    }

    public RegistroEntradaBoleto setQtdeDiasJuros(final String qtdeDiasJuros) {
        this.qtdeDiasJuros = qtdeDiasJuros;
        return this;
    }

    public RegistroEntradaBoleto setPercentualMulta(final String percentualMulta) {
        this.percentualMulta = percentualMulta;
        return this;
    }

    public RegistroEntradaBoleto setVlMulta(final String vlMulta) {
        this.vlMulta = vlMulta;
        return this;
    }

    public RegistroEntradaBoleto setQtdeDiasMulta(final String qtdeDiasMulta) {
        this.qtdeDiasMulta = qtdeDiasMulta;
        return this;
    }

    public RegistroEntradaBoleto setPercentualDesconto1(final String percentualDesconto1) {
        this.percentualDesconto1 = percentualDesconto1;
        return this;
    }

    public RegistroEntradaBoleto setVlDesconto1(final String vlDesconto1) {
        this.vlDesconto1 = vlDesconto1;
        return this;
    }

    public RegistroEntradaBoleto setDataLimiteDesconto1(final String dataLimiteDesconto1) {
        this.dataLimiteDesconto1 = dataLimiteDesconto1;
        return this;
    }

    public RegistroEntradaBoleto setPercentualDesconto2(final String percentualDesconto2) {
        this.percentualDesconto2 = percentualDesconto2;
        return this;
    }

    public RegistroEntradaBoleto setVlDesconto2(final String vlDesconto2) {
        this.vlDesconto2 = vlDesconto2;
        return this;
    }

    public RegistroEntradaBoleto setDataLimiteDesconto2(final String dataLimiteDesconto2) {
        this.dataLimiteDesconto2 = dataLimiteDesconto2;
        return this;
    }

    public RegistroEntradaBoleto setPercentualDesconto3(final String percentualDesconto3) {
        this.percentualDesconto3 = percentualDesconto3;
        return this;
    }

    public RegistroEntradaBoleto setVlDesconto3(final String vlDesconto3) {
        this.vlDesconto3 = vlDesconto3;
        return this;
    }

    public RegistroEntradaBoleto setDataLimiteDesconto3(final String dataLimiteDesconto3) {
        this.dataLimiteDesconto3 = dataLimiteDesconto3;
        return this;
    }

    public RegistroEntradaBoleto setPrazoBonificacao(final String prazoBonificacao) {
        this.prazoBonificacao = prazoBonificacao;
        return this;
    }

    public void setPercentualBonificacao(final String percentualBonificacao) {
        this.percentualBonificacao = percentualBonificacao;
    }

    public RegistroEntradaBoleto setVlBonificacao(final String vlBonificacao) {
        this.vlBonificacao = vlBonificacao;
        return this;
    }

    public RegistroEntradaBoleto setDtLimiteBonificacao(final String dtLimiteBonificacao) {
        this.dtLimiteBonificacao = dtLimiteBonificacao;
        return this;
    }

    public RegistroEntradaBoleto setVlAbatimento(final String vlAbatimento) {
        this.vlAbatimento = vlAbatimento;
        return this;
    }

    public RegistroEntradaBoleto setvlIOF(final String vlIOF) {
        this.vlIOF = vlIOF;
        return this;
    }

    public RegistroEntradaBoleto setNomePagador(final String nomePagador) {
        this.nomePagador = nomePagador;
        return this;
    }

    public RegistroEntradaBoleto setLogradouroPagador(final String logradouroPagador) {
        this.logradouroPagador = logradouroPagador;
        return this;
    }

    public RegistroEntradaBoleto setNuLogradouroPagador(final String nuLogradouroPagador) {
        this.nuLogradouroPagador = nuLogradouroPagador;
        return this;
    }

    public RegistroEntradaBoleto setComplementoLogradouroPagador(final String complementoLogradouroPagador) {
        this.complementoLogradouroPagador = complementoLogradouroPagador;
        return this;
    }

    public RegistroEntradaBoleto setCepPagador(final String cepPagador) {
        this.cepPagador = cepPagador.substring(0, 5);
        this.complementoCepPagador = cepPagador.substring(5, 8);
        return this;
    }

    public RegistroEntradaBoleto setBairroPagador(final String bairroPagador) {
        this.bairroPagador = bairroPagador;
        return this;
    }

    public RegistroEntradaBoleto setMunicipioPagador(final String municipioPagador) {
        this.municipioPagador = municipioPagador;
        return this;
    }

    public RegistroEntradaBoleto setUfPagador(final String ufPagador) {
        this.ufPagador = ufPagador;
        return this;
    }

    public RegistroEntradaBoleto setNuCpfcnpjPagador(final String nuCpfcnpjPagador) {
        this.nuCpfcnpjPagador = this.nuCPFCNPJ.length() == 14 ? nuCpfcnpjPagador : String.format("000%s", nuCpfcnpjPagador);
        this.cdIndCpfcnpjPagador = nuCpfcnpjPagador.length() == 14 ? "2" : "1";
        return this;
    }

    public RegistroEntradaBoleto setEndEletronicoPagador(final String endEletronicoPagador) {
        this.endEletronicoPagador = endEletronicoPagador;
        return this;
    }

    public RegistroEntradaBoleto setNomeSacadorAvalista(final String nomeSacadorAvalista) {
        this.nomeSacadorAvalista = nomeSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setLogradouroSacadorAvalista(final String logradouroSacadorAvalista) {
        this.logradouroSacadorAvalista = logradouroSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setNuLogradouroSacadorAvalista(final String nuLogradouroSacadorAvalista) {
        this.nuLogradouroSacadorAvalista = nuLogradouroSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setComplementoLogradouroSacadorAvalista(final String complementoLogradouroSacadorAvalista) {
        this.complementoLogradouroSacadorAvalista = complementoLogradouroSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setCepSacadorAvalista(final String cepSacadorAvalista) {
        this.cepSacadorAvalista = cepSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setComplementoCepSacadorAvalista(final String complementoCepSacadorAvalista) {
        this.complementoCepSacadorAvalista = complementoCepSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setBairroSacadorAvalista(final String bairroSacadorAvalista) {
        this.bairroSacadorAvalista = bairroSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setMunicipioSacadorAvalista(final String municipioSacadorAvalista) {
        this.municipioSacadorAvalista = municipioSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setUfSacadorAvalista(final String ufSacadorAvalista) {
        this.ufSacadorAvalista = ufSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setCdIndCpfcnpjSacadorAvalista(final String cdIndCpfcnpjSacadorAvalista) {
        this.cdIndCpfcnpjSacadorAvalista = cdIndCpfcnpjSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setNuCpfcnpjSacadorAvalista(final String nuCpfcnpjSacadorAvalista) {
        this.nuCpfcnpjSacadorAvalista = nuCpfcnpjSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setEndEletronicoSacadorAvalista(final String endEletronicoSacadorAvalista) {
        this.endEletronicoSacadorAvalista = endEletronicoSacadorAvalista;
        return this;
    }

    public String getNuCPFCNPJ() {
        return this.nuCPFCNPJ;
    }

    public String getFilialCPFCNPJ() {
        return this.filialCPFCNPJ;
    }

    public String getCtrlCPFCNPJ() {
        return this.ctrlCPFCNPJ;
    }

    public String getCdTipoAcesso() {
        return this.cdTipoAcesso;
    }

    public String getClubBanco() {
        return this.clubBanco;
    }

    public String getCdTipoContrato() {
        return this.cdTipoContrato;
    }

    public String getNuSequenciaContrato() {
        return this.nuSequenciaContrato;
    }

    public String getIdProduto() {
        return this.idProduto;
    }

    public String getNuNegociacao() {
        return this.nuNegociacao;
    }

    public String getCdBanco() {
        return this.cdBanco;
    }

    public String geteNuSequenciaContrato() {
        return this.eNuSequenciaContrato;
    }

    public String getTpRegistro() {
        return this.tpRegistro;
    }

    public String getCdProduto() {
        return this.cdProduto;
    }

    public String getNuTitulo() {
        return this.nuTitulo;
    }

    public String getNuCliente() {
        return this.nuCliente;
    }

    public String getDtEmissaoTitulo() {
        return this.dtEmissaoTitulo;
    }

    public String getDtVencimentoTitulo() {
        return this.dtVencimentoTitulo;
    }

    public String getTpVencimento() {
        return this.tpVencimento;
    }

    public String getVlNominalTitulo() {
        return this.vlNominalTitulo;
    }

    public String getCdEspecieTitulo() {
        return this.cdEspecieTitulo;
    }

    public String getTpProtestoAutomaticoNegativacao() {
        return this.tpProtestoAutomaticoNegativacao;
    }

    public String getPrazoProtestoAutomaticoNegativacao() {
        return this.prazoProtestoAutomaticoNegativacao;
    }

    public String getControleParticipante() {
        return this.controleParticipante;
    }

    public String getCdPagamentoParcial() {
        return this.cdPagamentoParcial;
    }

    public String getQtdePagamentoParcial() {
        return this.qtdePagamentoParcial;
    }

    public String getPercentualJuros() {
        return this.percentualJuros;
    }

    public String getVlJuros() {
        return this.vlJuros;
    }

    public String getQtdeDiasJuros() {
        return this.qtdeDiasJuros;
    }

    public String getPercentualMulta() {
        return this.percentualMulta;
    }

    public String getVlMulta() {
        return this.vlMulta;
    }

    public String getQtdeDiasMulta() {
        return this.qtdeDiasMulta;
    }

    public String getPercentualDesconto1() {
        return this.percentualDesconto1;
    }

    public String getVlDesconto1() {
        return this.vlDesconto1;
    }

    public String getDataLimiteDesconto1() {
        return this.dataLimiteDesconto1;
    }

    public String getPercentualDesconto2() {
        return this.percentualDesconto2;
    }

    public String getVlDesconto2() {
        return this.vlDesconto2;
    }

    public String getDataLimiteDesconto2() {
        return this.dataLimiteDesconto2;
    }

    public String getPercentualDesconto3() {
        return this.percentualDesconto3;
    }

    public String getVlDesconto3() {
        return this.vlDesconto3;
    }

    public String getDataLimiteDesconto3() {
        return this.dataLimiteDesconto3;
    }

    public String getPrazoBonificacao() {
        return this.prazoBonificacao;
    }

    public String getPercentualBonificacao() {
        return this.percentualBonificacao;
    }

    public String getVlBonificacao() {
        return this.vlBonificacao;
    }

    public String getDtLimiteBonificacao() {
        return this.dtLimiteBonificacao;
    }

    public String getVlAbatimento() {
        return this.vlAbatimento;
    }

    public String getvlIOF() {
        return this.vlIOF;
    }

    public String getNomePagador() {
        return this.nomePagador;
    }

    public String getLogradouroPagador() {
        return this.logradouroPagador;
    }

    public String getNuLogradouroPagador() {
        return this.nuLogradouroPagador;
    }

    public String getComplementoLogradouroPagador() {
        return this.complementoLogradouroPagador;
    }

    public String getCepPagador() {
        return this.cepPagador;
    }

    public String getComplementoCepPagador() {
        return this.complementoCepPagador;
    }

    public String getBairroPagador() {
        return this.bairroPagador;
    }

    public String getMunicipioPagador() {
        return this.municipioPagador;
    }

    public String getUfPagador() {
        return this.ufPagador;
    }

    public String getCdIndCpfcnpjPagador() {
        return this.cdIndCpfcnpjPagador;
    }

    public String getNuCpfcnpjPagador() {
        return this.nuCpfcnpjPagador;
    }

    public String getEndEletronicoPagador() {
        return this.endEletronicoPagador;
    }

    public String getNomeSacadorAvalista() {
        return this.nomeSacadorAvalista;
    }

    public String getLogradouroSacadorAvalista() {
        return this.logradouroSacadorAvalista;
    }

    public String getNuLogradouroSacadorAvalista() {
        return this.nuLogradouroSacadorAvalista;
    }

    public String getComplementoLogradouroSacadorAvalista() {
        return this.complementoLogradouroSacadorAvalista;
    }

    public String getCepSacadorAvalista() {
        return this.cepSacadorAvalista;
    }

    public String getComplementoCepSacadorAvalista() {
        return this.complementoCepSacadorAvalista;
    }

    public String getBairroSacadorAvalista() {
        return this.bairroSacadorAvalista;
    }

    public String getMunicipioSacadorAvalista() {
        return this.municipioSacadorAvalista;
    }

    public String getUfSacadorAvalista() {
        return this.ufSacadorAvalista;
    }

    public String getCdIndCpfcnpjSacadorAvalista() {
        return this.cdIndCpfcnpjSacadorAvalista;
    }

    public String getNuCpfcnpjSacadorAvalista() {
        return this.nuCpfcnpjSacadorAvalista;
    }

    public String getEndEletronicoSacadorAvalista() {
        return this.endEletronicoSacadorAvalista;
    }

}
