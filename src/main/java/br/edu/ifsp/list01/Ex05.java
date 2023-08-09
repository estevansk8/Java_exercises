package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/
public class Ex05 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);
        final int limite = sc.nextInt();
        final double multa = sc.nextDouble();
        final double acrescimo = sc.nextDouble();
        final int velocidade = sc.nextInt();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        final Ex05 ex05 = new Ex05();

        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex05.compute(limite, multa, acrescimo, velocidade));
    }

    String compute(int L, double m, double a, int v) {
        int velocidade_excedida = v - L;
        double valor_total = m + (a * velocidade_excedida);

        String valor_total_com_dois_decimais = String.format("%.2f", valor_total);
        String valor_formatado_com_ponto = valor_total_com_dois_decimais.replaceAll(",",".");


        if (velocidade_excedida > 0) return valor_formatado_com_ponto;

        return "0.00";
    }
}
