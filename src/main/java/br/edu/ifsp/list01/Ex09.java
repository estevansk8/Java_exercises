package br.edu.ifsp.list01;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    =>Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> vetorIdade = new ArrayList<>();
        while (true){
            final int idade = sc.nextInt();
            if (idade < 0)  break;
            vetorIdade.add(idade);
        }
        int[] vetorIdadeArray = vetorIdade.stream().mapToInt(Integer::intValue).toArray();
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex09 ex09 = new Ex09();
        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex09.compute(vetorIdadeArray));
    }

    String compute(int[] vetorIdadeArray) {
        int somaDasIdades = 0;
        int maioresDeIdade = 0;
        int pessoasIdosas = 0;
        int totalDePessoas = 0;

        for (int idade: vetorIdadeArray) {
            somaDasIdades += idade;
            if (idade >= 18) maioresDeIdade += 1;
            if (idade > 75) pessoasIdosas += 1;
            totalDePessoas += 1;
        }
        double mediaDeIdade = somaDasIdades / totalDePessoas;

        double porcentagemPessoasIdosas = pessoasIdosas * 100 / totalDePessoas;

        //tratando como a média vai ser exibida
        String media_com_dois_decimais = String.format("%.2f", mediaDeIdade);
        String mediaDeIdade_formatada_com_ponto = media_com_dois_decimais.replaceAll(",",".");

        //tratando como a quantidade dos maioresDeIdade vao ser exibidos
        String stringmaioresDeIdade = Integer.toString(maioresDeIdade);

        //tratando a forma como a porcentagem de pessoas idosas vai ser exibida
        String porcentagemPessoasIdosasComDoisDecimais = String.format("%.2f", porcentagemPessoasIdosas);
        String porcentagemPessoasIdosasComDoisDecimaisComPonto = porcentagemPessoasIdosasComDoisDecimais.replaceAll(",",".");

        return mediaDeIdade_formatada_com_ponto + " " + stringmaioresDeIdade + " " + porcentagemPessoasIdosasComDoisDecimaisComPonto + "%";

    }
}
