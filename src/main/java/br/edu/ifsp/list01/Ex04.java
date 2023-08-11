package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

 */
public class Ex04 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);

        final int dinheiro = sc.nextInt();
        final int preco = sc.nextInt();
        final int embalagens = sc.nextInt();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        final Ex04 ex04 = new Ex04();

        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex04.compute(dinheiro, preco,embalagens));
    }

    int compute(int n, int c, int m) {
        //TESTES "10,2,5,6", "12,4,4,3","8467,5,2,3385", "43203,60,5,899"
        // "6,2,2,5", "12,2,2,11","1000,10,10,111
        // Inicialmente, Osmar pode comprar chocolates com o dinheiro que possui
        int chocolates = (int) Math.floor(n / c);

        // Troca de embalagens por chocolates grátis
        int embalagens = chocolates;
        while (embalagens >= m) {
            int chocolatesGratis = embalagens / m;
            chocolates += chocolatesGratis;
            embalagens = chocolatesGratis + embalagens % m;
        }

        return chocolates;


    }
}
