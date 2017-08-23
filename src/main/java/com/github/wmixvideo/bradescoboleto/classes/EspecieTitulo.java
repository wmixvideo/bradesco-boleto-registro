package com.github.wmixvideo.bradescoboleto.classes;

public enum EspecieTitulo {

    CH("01", "CH", "CHEQUE"),
    DM("02", "DM", "DUPLICATA DE VENDA MERCANTIL"),
    DMI("03", "DMI", "DUPLICATA MERCANTIL POR INDICACAO"),
    DS("04", "DS", "DUPLICATA DE PRESTACAO DE SERVICOS"),
    DSI("05", "DSI", "DUPLICATA PREST. SERVICOS POR INDICACAO"),
    DR("06", "DR", "DUPLICATA RURAL"),
    LC("07", "LC", "LETRA DE CAMBIO"),
    NCC("08", "NCC", "NOTA DE CREDITO COMERCIAL"),
    NCE("09", "NCE", "NOTA DE CREDITO EXPORTACAO"),
    NCI("10", "NCI", "NOTA DE CREDITO INDUSTRIAL"),
    NCR("11", "NCR", "NOTA DE CREDITO RURAL"),
    NP("12", "NP", "NOTA PROMISSORIA"),
    NPR("13", "NPR", "NOTA PROMISSORIA RURAL"),
    TM("14", "TM", "TRIPLICATA DE VENDA MERCANTIL"),
    TS("15", "TS", "TRIPLICATA DE PRESTACAO DE SERVICOS"),
    NS("16", "NS", "NOTA DE SERVICO"),
    RC("17", "RC", "RECIBO"),
    FAT("18", "FAT", "FATURA"),
    ND("19", "ND", "NOTA DE DEBITO"),
    AP("20", "AP", "APOLICE DE SEGURO"),
    ME("21", "ME", "MENSALIDADE ESCOLAR"),
    PC("22", "PC", "PARCELA DE CONSORCIO"),
    DD("23", "DD", "DOCUMENTO DE DIVIDA"),
    CCB("24", "CCB", "CEDULA DE CREDITO BANCARIO"),
    FI("25", "FI", "FINANCIAMENTO"),
    RD("26", "RD", "RATEIO DE DESPESAS"),
    DRI("27", "DRI", "DUPLICATA RURAL INDICACAO"),
    EC("28", "EC", "ENCARGOS CONDOMINIAIS"),
    ECI("29", "ECI", "ENCARGOS CONDOMINIAIS POR INDICACAO"),
    CC("31", "CC", "CARTAO DE CREDITO"),
    BDP("32", "BDP", "BOLETO DE PROPOSTA"),
    OUT("99", "OUT", "OUTROS");

    private final String codigo;
    private final String sigla;
    private final String descricao;

    EspecieTitulo(final String codigo, final String sigla, final String descricao) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getSigla() {
        return this.sigla;
    }

    public static EspecieTitulo valueOfCodigo(final String codigo) {
        for (final EspecieTitulo ambiente : EspecieTitulo.values()) {
            if (ambiente.getCodigo().equalsIgnoreCase(codigo)) {
                return ambiente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.descricao;
    }

}
