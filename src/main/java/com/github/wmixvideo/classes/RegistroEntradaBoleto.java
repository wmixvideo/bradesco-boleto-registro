package com.github.wmixvideo.classes;

public class RegistroEntradaBoleto {

    private String nuCPFCNPJ;
    private String filialCPFCPNJ;
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
    private String vlBonificacao;
    private String dtLimiteBonificacao;
    private String vlAbatimento;
    private String VlIOF;
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
    private String nuIndCpfcnpjSacadorAvalista;
    private String endEletronicoSacadorAvalista;

    public RegistroEntradaBoleto() {
        this.preencherFixos();
    }

    public void preencherFixos() {
        this.cdTipoAcesso = "2";
        this.clubBanco = "2269651";
        this.cdTipoContrato = "48";
        this.cdBanco = "237";
        this.tpRegistro = "1";
        this.tpVencimento = "0";
    }

    public RegistroEntradaBoleto setNuCPFCNPJ(final String nuCPFCNPJ) {
        this.nuCPFCNPJ = nuCPFCNPJ;
        return this;
    }

    public RegistroEntradaBoleto setFilialCPFCPNJ(final String filialCPFCPNJ) {
        this.filialCPFCPNJ = filialCPFCPNJ;
        return this;
    }

    public RegistroEntradaBoleto setCtrlCPFCNPJ(final String ctrlCPFCNPJ) {
        this.ctrlCPFCNPJ = ctrlCPFCNPJ;
        return this;
    }

    public RegistroEntradaBoleto setCdTipoAcesso(final String cdTipoAcesso) {
        this.cdTipoAcesso = cdTipoAcesso;
        return this;
    }

    public RegistroEntradaBoleto setClubBanco(final String clubBanco) {
        this.clubBanco = clubBanco;
        return this;
    }

    public RegistroEntradaBoleto setCdTipoContrato(final String cdTipoContrato) {
        this.cdTipoContrato = cdTipoContrato;
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

    public RegistroEntradaBoleto setTpVencimento(final String tpVencimento) {
        this.tpVencimento = tpVencimento;
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

    public RegistroEntradaBoleto setVlIOF(final String vlIOF) {
        this.VlIOF = vlIOF;
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
        this.cepPagador = cepPagador;
        return this;
    }

    public RegistroEntradaBoleto setComplementoCepPagador(final String complementoCepPagador) {
        this.complementoCepPagador = complementoCepPagador;
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

    public RegistroEntradaBoleto setCdIndCpfcnpjPagador(final String cdIndCpfcnpjPagador) {
        this.cdIndCpfcnpjPagador = cdIndCpfcnpjPagador;
        return this;
    }

    public RegistroEntradaBoleto setNuCpfcnpjPagador(final String nuCpfcnpjPagador) {
        this.nuCpfcnpjPagador = nuCpfcnpjPagador;
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

    public RegistroEntradaBoleto setNuIndCpfcnpjSacadorAvalista(final String nuIndCpfcnpjSacadorAvalista) {
        this.nuIndCpfcnpjSacadorAvalista = nuIndCpfcnpjSacadorAvalista;
        return this;
    }

    public RegistroEntradaBoleto setEndEletronicoSacadorAvalista(final String endEletronicoSacadorAvalista) {
        this.endEletronicoSacadorAvalista = endEletronicoSacadorAvalista;
        return this;
    }

}
