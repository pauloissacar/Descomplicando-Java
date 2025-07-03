package com.noovi.maratonajava.introducao;

public class Aula04EstruturasCondicionaisPt02 {
    public static void main(String[] args) {
        /* Vamos pensar aqui em categorias para filmes.
        Se a idade for entre 0 - 14 consideraremos como criança. 15 - 17 - Adolescente. 18 > Adulto. */

        int idade = 19; //Declaramos a variável idade com valor 19.
        String categoria;/*Notasse que a variável categoria não foi iniciada, isso por que as tomadas de decisão abaixo estão realizando o
        Preenchimento. Mas, caso queira iniciar para não gerar linhas de erro, podemos fazer o seguinte: String categoria =""; passamos o valor vazio para ela.*/

        if (idade >= 0 && idade < 15) { // Verifica se a idade está entre 0 e 14.
            categoria = "Categoria Infantil"; //Executa caso o if seja verdadeiro.

            /* Aqui temos uma condição diferente do que já vimos. else if é utilizado para quando há mais de uma condição.
            Tem a sintaxe parecida com o if, que é a seguinte: else (condição){bloco de código a ser executado}
            como seria a forma de execução partindo para o else if:
            O código vai começar e verificar se tem entre 0 e 15(if). Caso não caia nessa condição, ele irá para o else if, como que perguntando o seguinte:
            "Já que não tem entre 0 e 15, será que tem entre 15 e 18?" e faz a verificação da condição. */
        } else if (idade >= 15 && idade < 18) {// Verifica se a idade está entre 15 e 17.
            categoria = "Categoria Juvenil";
        }
        // else é executado caso nenhuma das condições acima dele (if e ou else if) sejam verdadeiras.
        else {
            categoria = "Categoria Adulto";// O computador entende que entre 0 - 17 foram determinados como infantil e juvenil, então oque passar disso vai ser adulto.
        }
        System.out.println(categoria);//Imprimimos a categoria de acordo com a regra para idade.
    }
}
