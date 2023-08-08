package br.edu.ifsp.list01;

/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);

        //os valores devem ser recebidos separados por espaço
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex02 ex02 = new Ex02();

        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex02.compute(lado1, lado2, lado3));
    }

    String compute(int lado1, int lado2, int lado3) {
        //verifica se os numeros são validos
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0){
            return "Erro";
        }
        else {
            //verifica se é realmente um triangulo
            if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) return "Nao forma triangulo";

                //escaleno
            if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ) return "Escaleno";
                //equilatero
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3 ) return "Equilatero";
            else{
                return "Isosceles";
            }


        }
    }
}
