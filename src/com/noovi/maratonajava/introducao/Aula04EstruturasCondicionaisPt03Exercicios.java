package com.noovi.maratonajava.introducao;

public class Aula04EstruturasCondicionaisPt03Exercicios {
    public static void main(String[] args) {
        /* Operador ternário é uma forma simples de escrever o if e else. Funciona da seguinte forma:
         Variável =  condicao ? verdadeiro : falso;

        Exercitando: Um trabalhador recebe um valor X por hora trabalhada. Utilize
        operador ternário para avaliar se ele obteve ou não um bom salário.
        Salário acima de 120 reais será considerado um bom salário. */

        float horaTrabalhada = 10.30F;
        float valorPagamento = horaTrabalhada * 7;
        String faturamentoAlto = "Você recebeu um bom salário! ";
        String faturamentoBaixo = "Seu salário não foi tão bom dessa vez... ";

        String valorFinal = valorPagamento > 120 ? faturamentoAlto : faturamentoBaixo; //operador ternario
        System.out.println(valorFinal + valorPagamento);

    }
}
