package com.noovi.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /* Existem oito tipos primitivos, são eles:
        int, double, float, char, byte, short, long, boolean.
        Todos são numéricos com excessão do boolean. */

        //Ao declarar variáveis, sempre começar com letras minusculas.
        int idade = 10;
        long numeroGrande = 10000;
        double salarioDouble = 2000.0;
        float salaraioFloat = 2500.0F; //Variáveis do tipo float se faz necessário utilizar um f ou F após a declaração.
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 64; /* utilizando a tabela ASC||
        tabela de códigos numéricos que representa caracteres. Char = 64
        irá retornar um @. */


        //String é uma classe, classes se iniciam com letras maiúsculas.
        String nome = "Paulo";

        /* Qualquer conteudo adicional que não foi declarado como variável, ficará dentro das aspas duplas.
        Executando algumas variaveis criadas acima: */
        System.out.println("Idade do Paulo: " + idade);
        /* "Idade do Paulo" é um conteudo adicional que irá ser impresso no console mesmo sem ter sido declarado como variável.
        porém, notamos que também tem o +idade fora das aspas, essa é a forma de fazer com que a variável idade que criamos acima,
        também seja impressa junto com o conteúdo adicional.
         */
        System.out.println(falso);
        System.out.println("Char: " + caractere); // Outro exemplo com conteúdo adiconal junto com variável.
        System.out.println(nome);
        System.out.println(salaraioFloat);
    }
}
