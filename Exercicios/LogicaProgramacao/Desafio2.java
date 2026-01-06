package Exercicios.LogicaProgramacao;

import java.util.Scanner;
/*

    4. Localizador de Maior e Menor (Arrays)

    Objetivo: Manipular coleções de dados. Desafio: Crie um array que armazene 5 números digitados pelo usuário. 
    Ao final, o programa deve varrer esse array e imprimir:

    Qual é o maior número.
    Qual é o menor número.
    A média dos valores.

*/

public class Desafio2 {
    public static void main(String[] args) {
        // Declaração
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[5];
        int maiorNumero = numero[0];
        int menorNumero = numero[0];
        double soma = 0;
        double media;

        System.out.println("================================================");
        System.out.println("          Localizador de Maior e Menor          ");
        System.out.println("================================================");
        System.out.println("");

        // entrada e o processamento dos dados
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero inteiro: ");
            numero[i] = teclado.nextInt();
        }

        // saber o maior numero e menor numero
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];

            // variavel para maior e menor
            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            } else if (numero[i] < menorNumero) {
                menorNumero = numero[i];
            }
        }

        // Calcular a média
        media = soma / numero.length;

        System.out.println("============== Resultado ================");
        System.out.println();
        
        // Apresentação de arrays preenchido
        System.out.print("Números preenchidos: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        System.out.println("");

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Soma dos números: " + soma);
        System.out.println("A média dos números: " + media);

        System.out.println();

        teclado.close();
    }

}
