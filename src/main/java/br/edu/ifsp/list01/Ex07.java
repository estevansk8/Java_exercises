package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100         187.50
    1.50
    1.25
    150
*/
public class Ex07 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);

        final int limite_bandeira1 = sc.nextInt();
        final double valor1_por_Km = sc.nextDouble();
        final double valor2_por_Km = sc.nextDouble();
        final int quantidade_km_da_viagem = sc.nextInt();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex07 ex07 = new Ex07();

        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex07.compute(limite_bandeira1, valor1_por_Km, valor2_por_Km,quantidade_km_da_viagem));
    }

    double compute(int x, double v1, double v2, double a) {

        //se o andar for maior que o limite
        if (a>x) return calcular_valor_maior_que_X(x,a,v1,v2);
        //se nao calcula so ate onde vai
        return calcular_valor_menor_ou_ate_X(a,v1);
    }
    public static double calcular_valor_menor_ou_ate_X(double a, double v1){
        double valor = a * v1;

        String valor_formatado = String.format("%.1f",valor);
        String valor_fromatado_com_ponto = valor_formatado.replaceAll(",",".");

        double reposta = Double.valueOf(valor_fromatado_com_ponto).doubleValue();

        return reposta;

    }

    public static double calcular_valor_maior_que_X(int x, double a, double v1, double v2){
        double ate_x = x * v1;
        double depois_de_x = (a-x) * v2;

        double valortotal = ate_x + depois_de_x;

        String valor_formatado = String.format("%.1f", valortotal);
        String valor_formatado_com_ponto = valor_formatado.replaceAll(",",".");

        double resposta = Double.valueOf(valor_formatado_com_ponto).doubleValue();
        return resposta;
    }

}
