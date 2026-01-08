package Exercicios.LogicaProgramacao.Logica;

import java.util.Scanner;

/*
    1. O Verificador de Paridade (Básico)
   
    Objetivo: Praticar estruturas condicionais (if/else). 
    Desafio: Crie um programa que peça um número inteiro ao usuário. 
    O programa deve dizer se o número é par ou ímpar, e se ele é positivo, negativo ou zero.

*/

public class Atividade7 {
    public static void main(String[] args) {
        // variaveis e declaração
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("===========================");
        System.out.println("       Par ou impar        ");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            if (numero < 0) {
                System.out.println("Número negativo e par!");
            } else if (numero == 0) {
                System.out.println("Número é zero, porém é par!");
            } else if (numero > 0) {
                System.out.println("Número positivo e par!");
            }
        } else {
            if (numero < 0) {
                System.out.println("Número negativo e impar!");
            } else if (numero > 0) {
                System.out.println("Número positivo e impar!");
            }
        }
        teclado.close();
    }
}
