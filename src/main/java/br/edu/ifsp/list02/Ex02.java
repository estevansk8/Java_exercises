package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Faça um programa que construa dois vetores A e B de 5 posições, lendo e
    adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
    composto pela soma dos elementos de A e B. Por exemplo:

    C[0] = A[0] + B[0]
    C[1] = A[1] + B[1]

    Após isso, escreva o conteúdo do vetor C, separados por vírgula.
    Qualquer situação fora do domínio de entrada resulta em saída uma “Erro”.

    Exemplos de entrada e saída esperada:

    Entrada = 2 5 8 34 5               | Saída = 10, 56, 10, 50, 10
              8 51 2 16 5
    Entrada = -10 0 10 20 30           | Saída = 90, 50, 10, -30, -70
              100 50 0 -50 -100
*/
public class Ex02 {

    public static final int NUM_VALUES = 5;

    public static void main(String[] args) {
        //Leia o input
        final int[] arrayA = new int[NUM_VALUES];
        final int[] arrayB = new int[NUM_VALUES];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
        }

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        final Ex02 ex02 = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex02.compute(arrayA,arrayB));
    }

    String compute(int[] arrayA, int[] arrayB) {
        final int[]  arrayC = new int[NUM_VALUES];

        for (int i = 0; i < arrayC.length; i++) {
            //muda pra long pra nao dar overflow e depois verifica se isso é maior que
            //o maior numero do int

            //professor deu o comando aqui para transformar isso em metodo mas eu nao acompanhei
            if ((long) arrayA[i] + arrayB[i] > Integer.MAX_VALUE ||
                    (long) arrayA[i] + arrayB[i] < Integer.MIN_VALUE)
                return "Erro";
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        String output = "";

        for (int i = 0; i < arrayC.length; i++) {
            //professor deu um comando para passar isso para: output.append(array

            //PROFESSOR DEU VARIOS COMANDOS AQUI QUE EU NÃO ACOMPANHEI
            output += arrayC[i];
            if (i < arrayC.length -1){
                output += ", ";
            }
        }
        //put your logic here
        return output;
    }
}
