package com.github.wmixvideo.bradescoboleto.classes;

public enum TipoProtestoAutomaticoNegativacao {

    DIAS_CORRIDOS_PARA_PROTESTO("01"),
    DIAS_UTEIS_PARA_PROTESTO("02"),
    DIAS_CORRIDOS_PARA_NEGATIVACAO("03");

    private final String codigo;

    TipoProtestoAutomaticoNegativacao(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static TipoProtestoAutomaticoNegativacao valueOfCodigo(final String codigo) {
        for (final TipoProtestoAutomaticoNegativacao tipo : TipoProtestoAutomaticoNegativacao.values()) {
            if (tipo.getCodigo().equalsIgnoreCase(codigo)) {
                return tipo;
            }
        }
        return null;
    }

}
