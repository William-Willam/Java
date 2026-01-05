package Exercicios.Condicionais;

import java.util.Scanner;

// Exercício: Determinando o Nível de Satisfação
/*
    Objetivo:
    Criar um programa em Java que, com base em um número fornecido 
    pelo usuário (representando o nível de satisfação),
    determine e exiba o feedback correspondente.

    Instruções:

    1. Verificação do Número:
       - Declarar uma variável inteira chamada 'nivel' para armazenar o valor fornecido pelo usuário.
       - Utilizar a estrutura de controle 'switch' para avaliar o valor de 'nivel' 
       e atribuir o feedback apropriado com base nos seguintes critérios:
           • Se nivel for 1 → feedback: "Muito insatisfeito"
           • Se nivel for 2 → feedback: "Insatisfeito"
           • Se nivel for 3 → feedback: "Neutro"
           • Se nivel for 4 → feedback: "Satisfeito"
           • Se nivel for 5 → feedback: "Muito satisfeito"
           • Qualquer outro valor → feedback: "Opção inválida (deve estar entre 1 e 5)"

    2. Exibir o feedback resultante na saída padrão usando System.out.println.

    Tipo de switch a ser usado:
    - Utilizar o switch expressão (com setinha ->), disponível a partir do Java 14+.
*/
public class Exercicio_Switch_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nível de satisfação (1 a 5): ");
        int nivel = scanner.nextInt();

        String feedback = switch (nivel) {
            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito satisfeito";
            default -> "Opção inválida (deve estar entre 1 e 5)";
        };

        System.out.println("Feedback: " + feedback);
        scanner.close();
    }
}
