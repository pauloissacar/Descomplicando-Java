package com.noovi.maratonajava.introducao;

public class EstruturasDeRepeticao04 {
    //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição: valor parcela >= 1000;
    public static void main(String[] args) {
      double valorCarro = 14000;

      for(int i = 1; i <= valorCarro; i++){
          double valorParcela = valorCarro / i;
          if(valorParcela < 1000){
              break;
          }
          System.out.println("PARCELA: "+i+" VALOR: "+valorParcela+" R$");
      }
    }
}
