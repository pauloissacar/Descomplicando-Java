package com.noovi.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {

        String nomes[] = new String[3];

        nomes[0] = "Paulo";
        nomes[1] = "Issacar";
        nomes[2] = "Pereira";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}

