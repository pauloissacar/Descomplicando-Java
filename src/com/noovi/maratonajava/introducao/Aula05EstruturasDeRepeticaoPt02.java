package com.noovi.maratonajava.introducao;

public class Aula05EstruturasDeRepeticaoPt02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000

        for (int i = 3; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
