package com.noovi.maratonajava.introducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        //Os operadores são: + - / *

        //Vamos declarar duas variáveis do tipo int para praticarmos o uso dos operadores:
        int numero01 = 10;
        int numero02 = 20;

        double resultadoSoma = numero02 + numero01; /* Declaramos uma variável chamada resultadoSoma, que ira receber a soma de
        numero02 + numero01. Resumidamente irá fazer 20 + 10. */

        double resultadoDivisao = numero01 / (double) numero02; /* Declaramos uma variável chamada resultadoDivisao, que ira receber a divisão de
        numero01 / numero02. Resumidamente irá fazer 10 / 20. Porém, temos o seguinte: "(double)numero02", isto significa que temos um cast, ou seja,
        Variáveis de tipos diferentes que precisam se comunicar. "resultadoDivisao" é do tipo double por que divisões podem gerar números com casas
        decimais. "numero01" e "numero02" são do tipo int, ou seja, não possuem casas decimais. Se executarmos "double resultadoDivisao = numero01 / numero02"
        iriamos receber um valor final de 0,0. A nossa divisão teria resultado incorreto, precimamos fazer com que o tipo double se comunique com o tipo int,
         por isso "forçamos" uma das variaveis do tipo int a se comunicar com a do tipo double através do casting. (double)numero02 */

        System.out.println("Valor: " + resultadoSoma);
        System.out.println("Valor: " + resultadoDivisao);

            /* % Utilizasse para descobrir valores impares ou pares. Um bom exemplo seria o
         resto de uma divisão.*/
        int restoDivisao = 29 % 3;
        System.out.println(restoDivisao);


        /*  < Sinal de menor.
        > Sinal de maior.
        <= Sinal de menor ou igual.
        >= Sinal de maior ou igual.
        == Sinal de atribuição.
        != sinal de diferente. */

        //Os exemplos abaixo vamos considerá-los como perguntas:

        // 10 > 20 pode ser interpretado da seguinte forma:
        // 10 é maior que 20?
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte); //false

        /* 10 <= 20 pode ser interpretado da seguinte forma:
        10 é menor ou igual a 20? Devido termos uma condição (ou) nessa pergunta, precisamos apenas avaliar uma delas.
        O 10 ele é menor do que 20, mas, não é igual a 20. Devido uma dessas condições serem verdadeiras, iremos ter resultado
        true (verdadeiro) por que basta uma delas serem verdadeiras.*/
        boolean isDezMenorIgualVinte = 10 <= 20;
        System.out.println(isDezMenorIgualVinte); //true

        // 10 é igual a  20?
        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte); //false

        // 10 é diferente de 20?
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezDiferenteVinte); //true

        // && (And) || (Or)
        /*
        O && tem significado de E. É um operador que retorna true apenas se as duas condições forem verdadeiras.
        O || tem siginificado de OU. É um operador que retorna true apenas se uma das condições forem verdadeiras. */

        /* Para praticar o operador &&
        Vamos considerar o exemplo de uma pessoa que pretende tirar a carta de habilitação. Porém, além de ter
        idade minima exigida por lei, ela também precisa ter o valor para pagar o curso de motorista que custa 2.500 reais. */
        int idade = 20;
        float valorCarta = 2500F;
        boolean isPodeTirarCarta = idade > 18 && valorCarta == 2500; // A pessoa tem mais de 18 anos e o valor da carta é igual a 2500?
        System.out.println(isPodeTirarCarta); //true

        /* Para praticar o operador ||
        Vamos considerar que você vai comprar um celular online. No débito você possui 800 reais e no crédito 3000.
        O celular custa 1500. O sistema irá verificar as duas possibilidades de compra e efetuar uma modalidade apenas. */
        double valorCartaoDebito = 800;
        double valorCartaoCredito = 3000;
        float valorCelular = 1500;
        boolean isCelularCompravel = valorCartaoDebito > valorCelular || valorCartaoCredito > valorCelular; // Apenas uma dessas condições será verdadeira.
        System.out.println(isCelularCompravel); //true

        /* = += -= *= /= %=
        Você recebe um bonus mensal de 1000 e gostaria de somar esse bonus a um valor X.
        Podemos fazer isso da seguinte: */
        double bonus = 1000;
        bonus += 500; // Aqui estamos fazendo o seguinte raciocinio: bonus = bonus + 1000. bonus passará a vale 1500.
        System.out.println(bonus+" Valor atualizado 1 vez\n");
        bonus -= 1000; //Aqui estamos fazendo o seguinte raciocinio: bonus = bonus - 1000. bonus estava valendo 1500, porém dimuimos 1000. bonus agora vale 500.
        System.out.println(bonus+" Valor atualizado 2 vez");
        bonus /= 2; //Aqui estamos fazendo o seguinte raciocinio: bonus = bonus / 2. bonus estava valendo 500, porém dividimos por 2. bonus agora vale 250.
        System.out.println(bonus+" Valor atualizado 3 vez");

        //No exemplo acima, vimos que os valores são atualizados a cada execução, vamos praticar isso:
        int contador = 0; //Iniciamos uma variável contador com valor 0.
        contador += 1; //Quando colocamos "contador += 1" passamos a seguinte informação: contador = contador + 1. Logo contador será atualizado para 1.
        contador++;// Outra forma seria incrementando o "contador++".
        System.out.println(contador);

    }
}
