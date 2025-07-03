package com.noovi.maratonajava.introducao;

public class EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int i = (int) valorTotal; i >= 1; i--){
            double valorParcela = valorTotal / i;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("parcela número "+i+" Valor: "+valorParcela);
        }
    }
}
