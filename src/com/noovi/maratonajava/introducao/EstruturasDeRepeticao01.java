package com.noovi.maratonajava.introducao;

public class EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for.
        int contador = 1;
        while(contador <= 10){
            System.out.println(contador);
            contador += 1;
        }
        contador = 0;
        do{
            System.out.println("Dentro do laço de repetição.");
            contador +=1;
        }while(contador <= 10);

        for(int i=0; i<10 ;i++){
            System.out.println("For "+i);
        }
    }
}
