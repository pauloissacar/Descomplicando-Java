package com.noovi.maratonajava.introducao;

public class Aula05EstruturasDeRepeticaoPt01 {
    public static void main(String[] args) {
        // Temos as seguintes estruturas de repetição: while, do while, for.
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
