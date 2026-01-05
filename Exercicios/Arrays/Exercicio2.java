package Exercicios.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        // declaração
        int [] numeros = new int[1000];
        int soma = 0;

        // percoore o array 0 até 999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // soma os numeros
        for (int num : numeros) {
            soma += num; 
        }

        System.out.println("Soma de 1 até 1000: " + soma);
    }
}
