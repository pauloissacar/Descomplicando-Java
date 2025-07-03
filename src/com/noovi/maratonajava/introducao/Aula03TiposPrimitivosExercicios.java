package com.noovi.maratonajava.introducao;
/* Prática:
  Crie variáveis para os campos descritos abaixo entre <> e imprima a
  seguinte mensagem:

  Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário
  de <salário>, na data <data>. */
public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {
        String nome = "Paulo", endereco = "Luiz teixeira", nomeMes = "Junho";
        float salario = 1790.0F;
        int dia = 16;
        int mes = 06;
        int ano = 2025;

        System.out.println("Eu, "+nome+", morando no endereço: "+endereco+", confirmo que recebi o salário de: "+salario+", na data: "+dia+"/"+mes+" ("+nomeMes+") de "+ano);

    }
}
