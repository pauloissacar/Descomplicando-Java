package com.noovi.maratonajava.introducao;

public class Aula04EstruturasCondicionaisPt05 {
    public static void main(String[] args) {

        /* Aqui estaremos utilizando a estrutura de condição switch case. Tem a seguinte sintaxe:
        switch (variavel) {
        Case condição:
        }
        Podemos interpretar o switch case da seguinte forma: "switch = escolha, e case = caso :"
        Escolha caso. Como estamos falando de condições, então podemos ter inumeros cases de acordo com o exemplo abaixo.
         */

        //imprima o dia da semana considerando 1 como domingo.
        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default: /* O “default” tem como função o mesmo que o else do if e else. Caso não seja um dos cases
                por padrão será o “default”.*/
                System.out.println("Não reconhecido");
        }
        //Podemos fazer também o teste com caracteres, veja o exemplo abaixo:
        //Imprima se o individuo é do gênero masculino ou feminino identificando apenas pela letra M ou H
        char genero = 'F';

        switch (Character.toLowerCase(genero)) {
            case 'm':
                System.out.println("Masculino");
                break;

            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opcão inválida");//Qualquer outra letra será considerado por padrão como inválida.
        }


    }
}
