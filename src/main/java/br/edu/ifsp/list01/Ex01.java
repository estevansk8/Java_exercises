package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

    Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    Critério B: R$ 0,50 por livro + R$ 2,50 fixo
    Faça um programa em que o usuário informe a quantidade positiva e não nula de livros seja impress qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/
class Ex01 {

    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
        Scanner sc = new Scanner(System.in);
        final int quantidade_livros = sc.nextInt();
        final Ex01 ex01 = new Ex01();
        System.out.println(ex01.compute(quantidade_livros));
    }

    String compute(int qtdLivros) {
        //faz o calculo de qual e o melhor
        if (qtdLivros > 0){
            double criterioA = calcular_criterioA(qtdLivros);
            double criterioB = calcular_criterioB(qtdLivros);

            if (criterioA<criterioB) return "Criterio A";
            if (criterioA>criterioB) return "Criterio B";
            if (criterioA==criterioB) return ("Indiferente");

        }
        return "Erro";
    }

    public static double calcular_criterioA(int quantidade_livros){
        double valor = 7.5 + (quantidade_livros * 0.25);

        return valor;
    }

    public static double calcular_criterioB(int quantidade_livros){
        double valor = 2.5 + (quantidade_livros * 0.5);

        return valor;
    }

}
