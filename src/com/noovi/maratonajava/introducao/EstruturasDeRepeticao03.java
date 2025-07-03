package com.noovi.maratonajava.introducao;

public class EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 números de um dado valor. EX: 50.

        int valor = 50;

        for (int i = 1; i <= valor; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
