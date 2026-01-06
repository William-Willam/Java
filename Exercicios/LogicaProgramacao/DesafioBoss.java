package Exercicios.LogicaProgramacao;

import java.util.Scanner;

public class DesafioBoss {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        String palavraInversa = "";

        System.out.print("Digite uma palavra: ");
        palavra = teclado.next();

        // 1. Primeiro, construímos a palavra invertida
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInversa += palavra.charAt(i); // Acumula caractere por caractere
        }

        System.out.println("Palavra ao contrário: " + palavraInversa);

        // 2. Agora fazemos a comparação fora do laço
        // equalsIgnoreCase ignora se a letra é maiúscula ou minúscula
        if (palavra.equalsIgnoreCase(palavraInversa)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        teclado.close();
    }
}