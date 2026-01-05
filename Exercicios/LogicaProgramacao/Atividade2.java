package Exercicios.LogicaProgramacao;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        // entrada de dados e variáveis
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º numero: ");
            numero = teclado.nextInt();

            if (i == 1) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        teclado.close();
    }

}
/*
 * 
 * Objetivo: Comparação lógica e controle de variáveis.
 * 
 * Enunciado:
 * Crie um programa que:
 * Leia 5 números inteiros.
 * 
 * Ao final, mostre:
 * O maior número
 * O menor número
 * 
 * Dica:
 * Inicialize o maior e o menor com o primeiro valor lido.
 * 
 */