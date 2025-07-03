package com.noovi.maratonajava.introducao;

public class Aula04EstruturasCondicionaisPt04 {
    public static void main(String[] args) {
        /* Vamos tentar praticar mediante o seguinte exemplo:
        Em determinado país, pessoas que recebem até 34.500/ano, declaram 9.70% de impostos.
        Aqueles que recebem acima de 34.500/ano até 68.500/ano, declaram 37.50%
        Já os que recebem acima de 68.500/ano, declaram 49.50%.
        Utilizando estruturas condicionais e operadores, elabore como descobrir o valor a ser declarado por uma pessoa
        com salário anual de 70.000. */

        double salarioAnual = 34500;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;


        if (salarioAnual <= 34500) {
            salarioAnual *= primeiraFaixa;

        } else if (salarioAnual >= 34500 && salarioAnual <= 68500) {
            salarioAnual *= segundaFaixa;

        } else {
            salarioAnual *= terceiraFaixa;
        }
        double valorImposto = salarioAnual;

        System.out.println("Seu imposto será de : " + valorImposto);

    }
}
