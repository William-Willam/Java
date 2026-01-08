package Exercicios.LogicaProgramacao.Desafio;

import java.util.Scanner;

/*

    5. O Inversor de Nomes (Manipulação de Strings)
    Objetivo: Praticar lógica de strings e índices. Desafio: Peça ao usuário para digitar uma palavra ou nome. 
    O programa deve exibir essa palavra escrita de trás para frente, sem usar funções prontas como reverse(). 
    Use um laço de repetição para percorrer os caracteres.

*/

public class Desafio3 {
    public static void main(String[] args) {
        // Declaração
        Scanner teclado = new Scanner(System.in);
        String palavra;

        System.out.println("================================================");
        System.out.println("             Manipulação de String              ");
        System.out.println("================================================");
        System.out.println("");

        // entrada de dados
        System.out.print("Digite uma palavra: ");
        palavra = teclado.next();


        System.out.println("Palavra ao contrario: ");
        // processamento e saida de dados
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }

        teclado.close();
    }
}
