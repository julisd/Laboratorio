package br.edu.ifsc.padroesTestes.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilidadeTest {

    @Test
    public void testTransformaCaixaAlta() {
        String texto = "exemplo de texto";
        String resultado = Utilidade.transformaCaixaAlta(texto);
        Assertions.assertEquals("EXEMPLO DE TEXTO", resultado);

        String texto1 = "verifica SE ta alto";
        String resultado1 = Utilidade.transformaCaixaAlta(texto1);
        Assertions.assertEquals("VERIFICA SE TA ALTO", resultado1);

        String texto2 = "123abc";
        String resultado2 = Utilidade.transformaCaixaAlta(texto2);
        Assertions.assertEquals("123ABC", resultado2);

        String texto3 = "java";
        String resultado3 = Utilidade.transformaCaixaAlta(texto3);
        Assertions.assertEquals("JAVA", resultado3);

        String texto4 = "";
        String resultado4 = Utilidade.transformaCaixaAlta(texto4);
        Assertions.assertEquals("", resultado4);
    }

    @Test
    public void testTransformaNomePessoal() {
        String texto = "exemplo de nome pessoal";
        String resultado = Utilidade.transformaNomePessoal(texto);
        Assertions.assertEquals("Exemplo De Nome Pessoal", resultado);

        String texto1 = "ana mariana";
        String resultado1 = Utilidade.transformaNomePessoal(texto1);
        Assertions.assertEquals("Ana Mariana", resultado1);

        String texto2 = "juliana stefanes";
        String resultado2 = Utilidade.transformaNomePessoal(texto2);
        Assertions.assertEquals("Juliana Stefanes", resultado2);

        String texto3 = "julia";
        String resultado3 = Utilidade.transformaNomePessoal(texto3);
        Assertions.assertEquals("Julia", resultado3);

        String texto4 = "renato s.";
        String resultado4 = Utilidade.transformaNomePessoal(texto4);
        Assertions.assertEquals("Renato S.", resultado4);
    }

    @Test
    public void testRemoverAcentos() {
        String texto = "texto com acentuações";
        String resultado = Utilidade.removerAcentos(texto);
        Assertions.assertEquals("texto com acentuacoes", resultado);

        String texto1 = "Olá, mundo!";
        String resultado1 = Utilidade.removerAcentos(texto1);
        Assertions.assertEquals("Ola, mundo!", resultado1);

        String texto2 = "Coração";
        String resultado2 = Utilidade.removerAcentos(texto2);
        Assertions.assertEquals("Coracao", resultado2);

        String texto3 = "áéíóú";
        String resultado3 = Utilidade.removerAcentos(texto3);
        Assertions.assertEquals("aeiou", resultado3);

        String texto4 = "çãõ";
        String resultado4 = Utilidade.removerAcentos(texto4);
        Assertions.assertEquals("cao", resultado4);

        String texto5 = "";
        String resultado5 = Utilidade.removerAcentos(texto5);
        Assertions.assertEquals("", resultado5);
    }

    @Test
    public void testInverter() {
        String texto = "exemplo de texto invertido";
        String resultado = Utilidade.inverter(texto);
        Assertions.assertEquals("oditrevni otxet ed olpmexe", resultado);

        String texto1 = "Hello World!";
        String resultado1 = Utilidade.inverter(texto1);
        Assertions.assertEquals("!dlroW olleH", resultado1);

        String texto2 = "ana";
        String resultado2 = Utilidade.inverter(texto2);
        Assertions.assertEquals("ana", resultado2);

        String texto3 = "123abc";
        String resultado3 = Utilidade.inverter(texto3);
        Assertions.assertEquals("cba321", resultado3);

        String texto4 = "java";
        String resultado4 = Utilidade.inverter(texto4);
        Assertions.assertEquals("avaj", resultado4);

    }

}
