package Exercicios.LogicaProgramacao;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
       
        // entrada de dados e variáveis
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int somaPares = 0;

        //processamento
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                somaPares = somaPares + numero;
            }
        }

        // saída de dados
        System.out.println("A soma dos pares é: " + somaPares);
        teclado.close();
    }
}

/*
 * Objetivo: Trabalhar laço de repetição e condição.
 * 
 * Enunciado:
 * Crie um programa em Java que:
 * Leia 10 números inteiros informados pelo usuário.
 * Calcule e exiba a soma apenas dos números pares.
 * 
 * Regras:
 * Utilize for.
 * Utilize if para verificar se o número é par.
 * 
 */
