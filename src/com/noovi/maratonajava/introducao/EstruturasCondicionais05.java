package com.noovi.maratonajava.introducao;

public class EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana considerando 1 como domingo.
        byte dia = 10;
        //char, int, byte, short, enum, String
//        switch (dia) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//
//            default:
//                System.out.println("Não reconhecido");
//        }

        //Imprima se o individuo é do gênero masculino ou feminino identificando apenas pela letra M ou H
    char genero = 'F';

    switch (Character.toLowerCase(genero)){
        case 'm':
            System.out.println("Masculino");
            break;

        case 'f':
            System.out.println("Feminino");
            break;
        default:
            System.out.println("Opcão inválida");
    }


    }
}
