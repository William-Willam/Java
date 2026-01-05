package Exercicios.Condicionais;

/*
    Exercício Complementar 1: Verificador de Mês

    Criar um programa em Java que verifica o valor de uma variável representando um mês do ano
    e exibe o nome desse mês.

    Instruções:
    - Crie uma variável chamada 'mes' para representar um mês do ano (1 para janeiro, 2 para fevereiro, etc.).
    - Use a estrutura 'switch' para verificar o valor de 'mes'.
    - Com base no valor de 'mes', exiba uma mensagem correspondente ao mês.
*/

import java.util.Scanner;

public class VerificadorMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();

        String nomeMes = switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido";
        };

        System.out.println("Mês correspondente: " + nomeMes);
        scanner.close();
    }
}