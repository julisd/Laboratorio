package br.edu.ifsc.padroesTestes.demo;

import java.text.Normalizer;

public class Utilidade {
    public static String transformaCaixaAlta(String texto) {
        return texto.toUpperCase();
    }

    public static String transformaNomePessoal(String texto) {
        StringBuilder resultado = new StringBuilder();
        String[] palavras = texto.split(" ");

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                resultado.append(Character.toUpperCase(palavra.charAt(0)));
                resultado.append(palavra.substring(1).toLowerCase());
                resultado.append(" ");
            }
        }

        return resultado.toString().trim();
    }

    public static String removerAcentos(String texto) {
        String textoSemAcentos = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");

        return textoSemAcentos;
    }

    public static String inverter(String texto) {
        StringBuilder resultado = new StringBuilder(texto);
        resultado.reverse();

        return resultado.toString();
    }

}
