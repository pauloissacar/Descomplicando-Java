package com.noovi.maratonajava.introducao;

public class Aula04EstruturasCondicionaisPt01 {

    public static void main(String[] args) {
        // Abaixo temos um código para verificar idade. Caso a idade seja inferior a 18, irpa nos retornar um false.
        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;
        //Conseguimos realizar a expressão acima por que qualquer expressão de comparação retorna um true ou false. (<, >, <=, >=, == ...)

        /* Iremos ver sobre if e else.
        O if só entra em execução quando a condição estabelecida for verdadeira.
        O else entra em execução quando nenhuma das condições do if são verdadeiras.
        A sintaxe do if é a seguinte: if () {}.
        A do else sempre irá aparecer após o bloco do if, tem a seguinte sintaxe:
        else {}.
        Dentro das parenteses do if nós passamos as intruções e após as chaves nós iremos adicionar as instruções a serem
        executadas.
         */
        if (isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Autorizado a comprar bebidas alcoólicas");
        } else {
            System.out.println("Não autorizado a comprar bebidas alcoólicas");
        }

    }
}
