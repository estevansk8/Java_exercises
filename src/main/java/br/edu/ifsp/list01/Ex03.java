package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Escrever um programa que, dado um ano válido qualquer, verifica se ele é bissexto ou não:

    São bissextos todos os anos múltiplos de 400, p. ex: 1600, 2000, 2400, 2800...
    São bissextos todos os múltiplos de 4 e não múltiplos de 100, p.ex: 1996, 2004, 2008, 2012, 2016…
    Não são bissextos os demais anos.
    Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 1600 | Saída = Ano bissexto
    Exemplo 2: Entrada = 1997 | Saída = Ano nao bissexto
    Exemplo 3: Entrada = 2000 | Saída = Ano bissexto
    Exemplo 4: Entrada = 2016 | Saída = Ano bissexto
    Exemplo 5: Entrada = 0 | Saída = Erro
*/
public class Ex03 {

    public static void main(String[] args) {
        //Leia o input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        final Ex03 ex03 = new Ex03();
        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex03.compute(input));
    }


    String compute( String input) {
        // Chama funcao que verifica se o numero nao é decimal
        if (isInt(input)){
            // Se passar verifica se ele não é zero
            int year = Integer.parseInt(input);
            if ( year > 0){
                // Se nao for zero, chama funcao que calcula bissexto
                if (isbissexto(year)) return "Ano bissexto";
                if (!isbissexto(year))  return "Ano nao bissexto";
            }
        }
        // Se o numero for zero
            return "Erro";
    }

    private static boolean isInt(String input){
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    private static boolean isbissexto(int year){
        /*São bissextos todos os anos múltiplos de 400, p. ex: 1600, 2000, 2400, 2800...
        São bissextos todos os múltiplos de 4 e não múltiplos de 100, p.ex: 1996, 2004, 2008, 2012, 2016…
        Não são bissextos os demais anos.*/
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }
}
