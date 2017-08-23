package com.github.wmixvideo.bradescoboleto;

public enum BBRAmbiente {

    PRODUCAO("1", "Produ\u00e7\u00e3o", "https://cobranca.bradesconetempresa.b.br/ibpjregistrotitulows/registrotitulo"),
    HOMOLOGACAO("2", "Homologa\u00e7\u00e3o", "https://cobranca.bradesconetempresa.b.br/ibpjregistrotitulows/registrotitulohomologacao");

    private final String codigo;
    private final String descricao;
    private final String url;

    BBRAmbiente(final String codigo, final String descricao, final String url) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.url = url;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getUrl() {
        return this.url;
    }

    public static BBRAmbiente valueOfCodigo(final String codigo) {
        for (final BBRAmbiente ambiente : BBRAmbiente.values()) {
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
