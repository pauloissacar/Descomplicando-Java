package com.noovi.maratonajava.introducao;

public class Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3]; // int[] idades é uma variável de referência, ela está se referindo a new int[3], que é o nosso array, nosso obj.
        idades [0] = 25; //primeira posição do array que se inicia em zero.
        idades [1] = 28;// segunda posição do array.
        idades [2] = 30;//ultima posição do nosso array que foi declarado como 3.
        System.out.println(idades[2]); //Aqui iremos imprimir a posição 2 do nosso array, que é a ultima posição.

    }
}
