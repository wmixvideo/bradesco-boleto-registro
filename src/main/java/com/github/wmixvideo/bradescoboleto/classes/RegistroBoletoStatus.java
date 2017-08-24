package com.github.wmixvideo.bradescoboleto.classes;

public enum RegistroBoletoStatus {

    SERVICO_INDISPONIVEL("-99", "Servi\u00e7o indispon\u00edvel no momento. Tente novamente mais tarde", false),
    TAMANHO_INVALIDO("-4", "Tamanho do campo inv\u00e1lido", false),
    TIPO_CAMPO_INVALIDO("-3", "Tipo do campo inv\u00e1lido", false),
    CONTRATO_NAO_ENCONTRADO("-2", "Contrato n\u00e3o encontrado", false),
    CONTRATO_NAO_APROVADO("-1", "Contrato n\u00e3o aprovado", false),
    SOLICITACAO_ATENDIDA("0", "Solicita\u00e7\u00e3o atendida", true),
    SOLICITACAO_NAO_ENCONTRADA("1", "Solicita\u00e7\u00e3o n\u00e3o encontrada", false),
    ERRO_GENERICO_SISTEMA_INDISPONIVEL("2", "Erro Gen\u00e9rico \u2013 sistema indispon\u00edvel", false),
    INCLUSAO_EFETUADA("5", "Inclus\u00e3o efetuada", true),
    DADOS_INCONSISTENTES("6", "Dados inconsistentes", false),
    ERRO_ACESSO_SUBROTINA("10", "Erro Acesso Subrotina", false),
    CLIENTE_NEGOCIACAO_BLOQUEADO("12", "Cliente/Negocia\u00e7\u00e3o Bloqueado", false),
    USUARIO_NAO_AUTORIZADO("13", "Usu\u00e1rio n\u00e3o Autorizado", false),
    ESPECIE_TITULO_INVALIDA("14", "Esp\u00e9cie T\u00edtulo Inv\u00e1lida", false),
    TIPO_NUMERO_INSCRICAO_INVALIDO("15", "Tipo_N\u00famero Inscri\u00e7\u00e3o Inv\u00e1lido", false),
    INFORME_TODOS_CAMPOS_PARA_DECURSO_DE_PRAZO("16", "Informe todos os campos para decurso de Prazo", false),
    NOME_DO_PAGADOR_ESPECIAL_NAO_INFORMADO("17", "Nome do Pagador Especial N\u00e3o Informado", false),
    ENDERECO_INVALIDO("18", "Endere\u00e7o Inv\u00e1lido", false),
    CEP_INVALIDO("19", "CEP Inv\u00e1lido", false),
    AGENCIA_DEPOSITARIA_INVALIDA("20", "Ag\u00eancia Deposit\u00e1ria Inv\u00e1lida", false),
    INFORME_TODOS_CAMPOS_PARA_INSTRUCAO_DE_PROTESTO("21", "Informe todos os campos para Instru\u00e7\u00e3o de Protesto", false),
    BANCO_INVALIDO("22", "Banco Inv\u00e1lido", false),
    SEU_NUMERO_INVALIDO("23", "Seu N\u00famero Inv\u00e1lido", false),
    INFORME_TODOS_CAMPOS_PARA_ABATIMENTO("24", "Informe todos os campos para Abatimento", false),
    VALOR_DOS_JUROS_MAIOR_QUE_O_VALOR_DO_TITULO("25", "Valor dos Juros maior que o Valor do T\u00edtulo", false),
    DATA_DE_EMISSAO_MAIOR_QUE_A_DATA_DE_VENCIMENTO("26", "Data de Emiss\u00e3o maior que a Data de Vencimento", false),
    DOCUMENTO_DO_SACADOR_AVALISTA_INVALIDO("27", "Documento do Sacador Avalista Inv\u00e1lido", false),
    INFORME_TODOS_CAMPOS_PARA_DESCONTO("28", "Informe todos os campos para Desconto", false),
    INFORME_TODOS_CAMPOS_PARA_SACADOR_AVALISTA("29", "Informe todos os campos para Sacador Avalista", false),
    DATA_VENCIMENTO_MENOR_OU_IGUAL_DATA_EMISSAO("30", "Data Vencimento Menor ou igual Data Emiss\u00e3o", false),
    DATA_DESCONTO_MENOR_OU_IGUAL_DATA_EMISSAO("31", "Data Desconto menor ou igual Data Emiss\u00e3o", false),
    DATA_DESCONTO_MAIOR_QUE_DATA_VENCIMENTO("32", "Data Desconto maior que Data Vencimento", false),
    VALOR_DESCONTO_BONIFICACAO_MAIOR_OU_IGUAL_VALOR_TITULO("33", "Valor Desconto_Bonifica\u00e7\u00e3o maior ou igual Valor T\u00edtulo", false),
    TIPO_INFORMADO_DEVE_SER_1_2_OU_3("34", "Tipo informado deve ser 1, 2 ou 3", false),
    VALOR_ABATIMENTO_MAIOR_QUE_O_VALOR_DO_TITULO("35", "Valor Abatimento maior que o Valor do T\u00edtulo", false),
    CEP_INVALIDO2("36", "CEP Inv\u00e1lido", false),
    DATA_EMISSAO_INVALIDA("37", "Data Emiss\u00e3o Inv\u00e1lida", false),
    DATA_VENCIMENTO_INVALIDA("38", "Data Vencimento Inv\u00e1lida", false),
    PERCENTUAL_INFORMADO_MAIOR_OU_IGUAL_100("39", "Percentual informado maior ou igual 100,00", false),
    NUMERO_CGC_CPF_INVALIDO("40", "N\u00famero CGC_CPF inv\u00e1lido", false),
    PROTESTO_AUTOMATICO_X_DECURSO_DE_PRAZO_INCOMPATIVEL("41", "Protesto Autom\u00e1tico x Decurso de Prazo Incompat\u00edvel", false),
    BANCO_AGENCIA_DEPOSITARIA_INVALIDO("42", "Banco_Ag\u00eancia Deposit\u00e1ria Inv\u00e1lido", false),
    ESPECIE_DE_DOCUMENTO_INVALIDO("43", "Esp\u00e9cie de Documento inv\u00e1lido", false),
    INFORME_1_CONTRA_APRESENTACAO_OU_2_A_VISTA("44", "Informe 1/contra apresenta\u00e7\u00e3o ou 2-a vista", false),
    CODIGO_DA_INSTRUCAO_DE_PROTESTO_INVALIDO("45", "C\u00f3digo da instru\u00e7\u00e3o de protesto inv\u00e1lido", false),
    DIAS_PARA_INSTRUCAO_DE_PROTESTO_INVALIDO("46", "Dias para instru\u00e7\u00e3o de protesto inv\u00e1lido", false),
    CODIGO_PARA_DESCONTO_INVALIDO("47", "C\u00f3digo para desconto inv\u00e1lido", false),
    CODIGO_PARA_MULTA_INVALIDO("48", "C\u00f3digo para multa inv\u00e1lido", false),
    CODIGO_PARA_COMISSAO_PERMANENCIA_DIA_INVALIDO("49", "C\u00f3digo para comiss\u00e3o perman\u00eancia dia inv\u00e1lido", false),
    ESPECIE_DOCUMENTO_EXIGE_CGC_PARA_SACADOR_AVALISTA("50", "Esp\u00e9cie Documento exige CGC para Sacador Avalista", false),
    CEP_E_OU_BANCO_AGENCIA_DEPOSITARIA_INVALIDO("51", "CEP e/ou Banco/Ag\u00eancia Deposit\u00e1ria Inv\u00e1lido", false),
    DATA_EMISSAO_MAIOR_OU_IGUAL_DATA_VENCIMENTO("52", "Data Emiss\u00e3o maior ou igual Data Vencimento", false),
    DATA_DESCONTO_INVALIDA("53", "Data Desconto Inv\u00e1lida", false),
    DATA_EMISSAO_MAIOR_DATA_REGISTRO("54", "Data emiss\u00e3o maior Data Registro", false),
    PERCENTUAL_MULTA_INFORMADO_MAIOR_QUE_O_PERMITIDO("55", "Percentual multa informado maior que o permitido", false),
    PERCENTUAL_COMISSAO_PERMANENCIA_INFORMADO_MAIOR_QUE_O_PERMITIDO("56", "Percentual comiss\u00e3o perman\u00eancia informado maior que o Permitido", false),
    PERCENTUAL_BONIFICACAO_INFORMADO_MAIOR_QUE_O_PERMITIDO("57", "Percentual Bonifica\u00e7\u00e3o informado maior que o permitido", false),
    PRAZO_PARA_PROTESTO_INVALIDO("58", "Prazo para Protesto inv\u00e1lido", false),
    INFORME_A_DATA_OU_TIPO_DO_VENCIMENTO("59", "Informe a data ou tipo do vencimento", false),
    VALOR_DO_IOF_NAO_PERMITIDO_PARA_PRODUTOS_05_15_43_OU_44("60", "Valor do IOF n\u00e3o permitido para produtos 05,15,43 ou 44", false),
    ABATIMENTO_JA_CADASTRADO_PARA_O_TITULO("61", "Abatimento j\u00e1 cadastrado para o t\u00edtulo", false),
    ABATIMENTO_NAO_CADASTRADO_PARA_O_TITULO("62", "Abatimento n\u00e3o cadastrado para o t\u00edtulo", false),
    NAO_E_PERMITIDA_MAIS_DE_UMA_BONIFICACAO_PARA_O_TITULO("63", "N\u00e3o \u00e9 permitida mais de uma bonifica\u00e7\u00e3o para o t\u00edtulo", false),
    NAO_E_PERMITIDO_DATAS_DE_DESCONTO_BONIFICACAO_IGUAIS("64", "N\u00e3o \u00e9 permitido datas de desconto_bonifica\u00e7\u00e3o iguais", false),
    NEGOCIACAO_INEXISTENTE("65", "Negocia\u00e7\u00e3o inexistente", false),
    CLIENTE_INEXISTENTE("66", "Cliente inexistente", false),
    CNPJ_CPF_INVALIDO("67", "CNPJ_CPF inv\u00e1lido", false),
    N_NUMERO_NAO_PODE_SER_INFORMADO_QUANDO_STATUS_4("68", "N.N\u00famero n\u00e3o pode ser informado quando status 4", false),
    TITULO_JA_CADASTRADO("69", "T\u00edtulo j\u00e1 cadastrado", false),
    DATA_E_TIPO_DE_VENCIMENTO_INCOMPATIVEIS("70", "Data e tipo de vencimento incompat\u00edveis", false),
    DATA_DE_VENCIMENTO_NAO_PODE_SER_POSTERIOR_A_10_ANOS("71", "Data de vencimento n\u00e3o pode ser posterior a 10 anos", false),
    DIAS_PARA_INSTRUCAO_INFERIOR_AO_PADRAO("72", "Dias para instru\u00e7\u00e3o inferior ao padr\u00e3o", false),
    DIAS_PARA_INSTRUCAO_ANTECIPA_DATA_DE_PROTESTO("73", "Dias para instru\u00e7\u00e3o antecipa data de protesto", false),
    VALOR_IOF_OBRIGATORIO("74", "Valor IOF obrigat\u00f3rio", false),
    VALOR_IOF_INCOMPATIVEL_COM_ID_PRODUTO("75", "Valor IOF incompat\u00edvel com id produto", false),
    TIPO_DE_ABATIMENTO_INVALIDO("76", "Tipo de abatimento inv\u00e1lido", false),
    STATUS_INVALIDO("77", "Status Inv\u00e1lido", false),
    REGISTRO_ON_LINE_NAO_PERMITE_BANCO_DIFERENTE_DE_237("78", "Registro on line n\u00e3o permite banco diferente de 237", false),
    CARTA_PARA_PROTESTO_NAO_RECEBIDA("79", "Carta para protesto n\u00e3o recebida", false),
    TIPO_DE_VENCIMENTO_INVALIDO("80", "Tipo de vencimento inv\u00e1lido", false),
    VALOR_ACUMULADO_DESCONTO_BONIFICACAO_MAIOR_OU_IGUAL_VALOR_TITULO("81", "Valor acumulado desconto/bonifica\u00e7\u00e3o maior ou igual valor t\u00edtulo", false),
    DATAS_DESCONTO_BONIFICACAO_FORA_DE_SEQUENCIA("82", "Datas desconto_bonifica\u00e7\u00e3o fora de sequ\u00eancia", false),
    INFORME_TODOS_CAMPOS_PARA_MULTA("83", "Informe todos os campos para multa", false),
    CODIGO_COMISSAO_PERMANENCIA_INVALIDO("84", "C\u00f3digo comiss\u00e3o perman\u00eancia inv\u00e1lido", false),
    INFORME_TODOS_CAMPOS_PARA_COMISSAO_PERMANENCIA("85", "Informe todos os campos para comiss\u00e3o perman\u00eancia", false),
    REGISTRO_DUPLICADO_NA_TABELA_DE_OCORRENCIAS("86", "Registro duplicado na tabela de ocorr\u00eancias", false),
    SOLICITACAO_DE_PROTESTO_JA_EXISTENTE("87", "Solicita\u00e7\u00e3o de protesto j\u00e1 existente", false),
    REGISTRO_DUPLICADO_NA_BASE_DE_ATUALIZACAO_SEQUENCIAL("88", "Registro duplicado na base de atualiza\u00e7\u00e3o sequencial", false),
    SACADOR_AVALISTA_JA_CADASTRADO("89", "Sacador avalista j\u00e1 cadastrado", false),
    INDICADOR_CIP_INEXISTENTE("90", "Indicador CIP inexistente", false),
    MOEDA_NEGOCIADA_INEXISTENTE("91", "Moeda negociada inexistente", false),
    BANCO_AGENCIA_OPERADORA_INEXISTENTE("92", "Banco/ag\u00eancia operadora inexistente", false),
    ACESSORIO_ESCRITURAL_NEGOCIADO_INEXISTENTE("93", "Acess\u00f3rio escritural negociado inexistente", false),
    POLO_DE_SERVICO_INEXISTENTE_PARA_BANCO_AGENCIA("94", "P\u00f3lo de servi\u00e7o inexistente para banco/ag\u00eancia", false),
    BANCO_AGENCIA_CENTRALIZADORA_NAO_CADASTRADA_PARA_BANCO_AGENCIA("95", "Banco_ag\u00eancia centralizadora n\u00e3o cadastrada para banco/ag\u00eancia deposit\u00e1ria", false),
    TITULO_NAO_ENCONTRADO_PELO_MODULO_CBON8230("96", "T\u00edtulo n\u00e3o encontrado pelo m\u00f3dulo CBON8230", false),
    VALOR_IOF_MAIOR_OU_IGUAL_VALOR_TITULO("97", "Valor IOF maior ou igual valor t\u00edtulo", false),
    DATA_INVALIDA("98", "Data Inv\u00e1lida", false),
    ID_PROD_CTA_NAO_CADASTRADOS("99", "Id Prod/Cta n\u00e3o cadastrados", false);

    private final String codigo;
    private final String descricao;
    private final boolean statusOk;

    RegistroBoletoStatus(final String codigo, final String descricao, final boolean statusOk) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.statusOk = statusOk;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public boolean isStatusOk() {
        return this.statusOk;
    }

    public static RegistroBoletoStatus valueOfCodigo(final String codigo) {
        for (final RegistroBoletoStatus ambiente : RegistroBoletoStatus.values()) {
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
