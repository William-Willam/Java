package Exercicios.LogicaProgramacao;

import java.util.Scanner;

/*

    3. O Somador de Intervalos (Lógica com while)

    Objetivo: Entender acumuladores e controle de fluxo. 
    Desafio: Peça ao usuário dois números inteiros (um início e um fim). 
    O programa deve somar todos os números entre esse intervalo (inclusive) e exibir o resultado. 
    Exemplo: Entrada 3 e 6 -> Resultado: 18 (3+4+5+6).

*/

public class Atividade9 {
    public static void main(String[] args) {
        // Declaração e variaveis
        Scanner teclado = new Scanner(System.in);
        int num1, num2, Somador = 0;

        System.out.println("=========================================");
        System.out.println("          Somador de Intervalos          ");
        System.out.println("=========================================");
        System.out.println("");

        // entrada de dados
        System.out.println("Digite um numero inteiro: ");
        num1 = teclado.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        num2 = teclado.nextInt();

        // (Pulo do Gatao) Se o usuário digitar o maior primeiro, nós invertemos os valores
        if (num1 > num2) {
            int auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        
        // processamento
        while (num1 <= num2) {
            Somador += num1++;
        }

        // Resultado
        System.out.println("Resultado: " + Somador);

        teclado.close();
    }
}
