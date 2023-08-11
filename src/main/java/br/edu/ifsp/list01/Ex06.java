package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);

        final double largura = sc.nextDouble();
        final double altura = sc.nextDouble();
        final double valor_lata = sc.nextDouble();
        final double rendimento_lata = sc.nextDouble();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex06 ex06 = new Ex06();

        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex06.compute(largura, altura, valor_lata, rendimento_lata));
    }

    String compute(double L, double a, double c, double m) {
        //imprima quantas latas de tintas são necessárias e o custo total (com duas casas decimais)
        double area = L * a;

        //Quantidade de latas que são necessarias para cobrir a area
        int quantidade_latas_necessarias = (int) Math.ceil(area / m);
        String str_quantidade_latas_necessarias = Integer.toString(quantidade_latas_necessarias);

        //Custo total
        double custo_total = c * quantidade_latas_necessarias;

        //fazendo formataçao
        String valor_total_com_dois_decimais = String.format("%.2f", custo_total);
        String valor_formatado_com_ponto = valor_total_com_dois_decimais.replaceAll(",",".");

        return str_quantidade_latas_necessarias + " " + valor_formatado_com_ponto;

    }
}
