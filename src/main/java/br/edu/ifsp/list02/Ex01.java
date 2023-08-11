package br.edu.ifsp.list02;

/*
    Faça um programa que leia dados inteiros da temperatura diária durante uma semana,
    armazenando em um vetor. Na sequência, escreva quantos dias dessa semana a temperatura
    esteve acima da média. As sete temperaturas devem ser lidas na mesma linha, separada
    por espaço.

    Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 2 2 2 2 2 3 | Saída = 1
    Exemplo 2: Entrada = 21 10 13 34 30 21 34 | Saída = 3
    Exemplo 3: Entrada = 2 2 2 2 2 2 1| Saída = 6
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex01 {
    static final int DAYS_IN_WEEK = 7;
    public static void main(String[] args) {
        //Leia o input
        int[] temperatures = new int[DAYS_IN_WEEK];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temperatures.length ; i++) {
            temperatures[i] = sc.nextInt();
        }

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        final Ex01 ex01 = new Ex01();
        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex01.compute(temperatures));
    }

    int compute(int[] temperatures) {
        int TemperaturesAboveAverage = 0;
        //put your logic here
        double sumOfTemperatures = 0;

        for (int temperature : temperatures) {
            sumOfTemperatures += temperature;
        }
        final double meanOfTemperatures = sumOfTemperatures / DAYS_IN_WEEK;

        for (int i: temperatures) {
            if (i > meanOfTemperatures) TemperaturesAboveAverage++;
        }

        return TemperaturesAboveAverage;
    }
}
