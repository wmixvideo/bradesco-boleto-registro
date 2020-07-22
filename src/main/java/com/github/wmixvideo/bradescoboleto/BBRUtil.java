package com.github.wmixvideo.bradescoboleto;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public abstract class BBRUtil {

    private static final BigDecimal CEM = new BigDecimal("100");
    private static final BigDecimal CEM_MIL = new BigDecimal("100000");
    public static final String REGEX_EMAIL_VALIDO = "(?:[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public static String formataData(final Date valor, final boolean obrigatorio, final String info) {
        validarObrigatorio(obrigatorio, valor, info);
        return valor != null ? new SimpleDateFormat("dd.MM.yyyy").format(valor) : "";
    }

    public static String formataValor(final BigDecimal valor, final boolean obrigatorio, final String info) {
        validarObrigatorio(obrigatorio, valor, info);
        return valor != null ? new DecimalFormat("#################").format(valor.multiply(BBRUtil.CEM)) : "0";
    }

    public static String formataPercentual(final BigDecimal valor, final boolean obrigatorio, final String info) {
        validarObrigatorio(obrigatorio, valor, info);
        return valor != null ? new DecimalFormat("00000000").format(valor.multiply(BBRUtil.CEM_MIL)) : "0";
    }

    public static String formataStringApenasNumeros(final String valor, final int tamanhoMaximo, final boolean truncar, final String info, final boolean obrigatorio) {
        return BBRUtil.formataString(valor != null ? Pattern.compile("\\D").matcher(valor).replaceAll("").trim() : null, tamanhoMaximo, truncar, info, obrigatorio);
    }

    public static String formataString(final String valor, final int tamanhoMaximo, final boolean truncar, final String info, final boolean obrigatorio) {
        final String textoNormalizado = BBRUtil.removeCaracteresEspeciais(valor);
        validarObrigatorio(obrigatorio, textoNormalizado, info);
        return valor != null ? BBRUtil.validaTamanhoMaximo(textoNormalizado, tamanhoMaximo, info, truncar) : "";
    }

    public static String formataEmail(final String valor, final int tamanhoMaximo, final boolean truncar, final String info, final boolean obrigatorio) {
        validarObrigatorio(obrigatorio, valor, info);
        validarEmail(valor);
        return valor != null ? BBRUtil.validaTamanhoMaximo(valor, tamanhoMaximo, info, truncar) : "";
    }


    private static String validaTamanhoMaximo(final String string, final int tamanhoMaximo, final String info, final boolean truncar) {
        final boolean stringVazia = string == null || string.trim().length() == 0;
        if (!stringVazia && string.length() > tamanhoMaximo) {
            if (truncar) {
                return string.substring(0, tamanhoMaximo);
            } else {
                throw new IllegalStateException(String.format("%s \"%s\" deve possuir entre 1-%s caracteres", info, string, tamanhoMaximo));
            }
        }
        return string;
    }

    public static void validarObrigatorio(final boolean obrigatorio, final Object valor, final String info) {
        if (obrigatorio) {
            if (valor == null || (valor instanceof BigDecimal && ((BigDecimal) valor).signum() <= 0) || (valor instanceof String && ((String) valor).trim().isEmpty())) {
                throw new IllegalArgumentException(String.format("%s nao pode ser nulo!", info));
            }
        }
    }

    public static String removeCaracteresEspeciais(final String texto) {
        if (texto != null && !texto.trim().isEmpty()) {
            final String textoSemAcento = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            return textoSemAcento.replaceAll("[^A-Za-z0-9 .,-]", "");
        }
        return texto;
    }

    public static void validarEmail(final String email) {
        if (email != null && !email.trim().isEmpty()){
            if (!Pattern.compile(REGEX_EMAIL_VALIDO).matcher(email).matches()){
                throw new IllegalArgumentException(String.format("O email '%s' n\u00e3o \u00e9 valido!", email));
            }
        }
    }
}