package Exercicios.LogicaProgramacao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        // declaração
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            if (numero < 0) {
                System.out.println("Numero é negativo, e ele par!");
            } else if (numero == 0) {
                System.out.println("Este número é zero, não pode ser divido!");
            } else if (numero > 0) {
                System.out.println("Numero é positivo, e ele par!");
            }
        } else {
            if (numero < 0) {
                System.out.println("Numero é negativo, e ele impar!");
            } else if (numero == 0) {
                System.out.println("Este número é zero, não pode ser divido!");
            } else if (numero > 0) {
                System.out.println("Numero é positivo, e ele impar!");
            }
        }
        teclado.close();
    }

}

/*
 * Crie um programa que receba um número inteiro.
 * O programa deve imprimir se o número é "Par" ou "Ímpar" e,
 * além disso, se ele é "Positivo", "Negativo" ou "Zero".
 */
