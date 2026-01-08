package Exercicios.LogicaProgramacao.Logica;

import java.util.Scanner;

/*

    2. Tabuada Dinâmica (Laços de Repetição)
    Objetivo: Praticar o uso do laço for. Desafio: Peça ao usuário um número de 1 a 10. 
    Imprima a tabuada desse número no formato: 5 x 1 = 5 5 x 2 = 10 ... até 10.

*/

public class Atividade8 {
    public static void main(String[] args) {
        // variaveis e instancias
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("===========================");
        System.out.println("          Tabuada          ");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();
        System.out.println("");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
            //System.out.println();
            //System.out.println("Dica importante usando o Format!!!");
            // %d é um marcador para números inteiros (decimal)
            // %n pula uma linha
            //System.out.printf("%d * %d = %d%n", numero, i, resultado);
        }

        teclado.close();
    }

}
