package Exercicios.LogicaProgramacao.Desafio;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        // declaração
        Scanner teclado = new Scanner(System.in);
        int valor, cedulas50, cedulas10, opcao;

        System.out.println("=======================================");
        System.out.println("Olá bem-vindo ao caixa eletronico!!!!!");
        System.out.println("=======================================");

        do {
            System.out.println();
            System.out.println("Digite o valor que deseja sacar: ");
            valor = teclado.nextInt();

            // cedulas de 50
            cedulas50 = valor / 50;
            System.out.println("São " + cedulas50 + " cedulas de 50");

            // resto
            double sobrou = valor % 50;
            System.out.println("Sobrou: " + sobrou);

            // notas de 10
            cedulas10 = (int) (sobrou / 10);
            System.out.println("São " + cedulas10 + " cedulas de 10");

            System.out.println("Deseja continuar? (1-Sim / 0-Sair)");
            opcao = teclado.nextInt();
        } while (opcao == 1);

        System.out.println("Obrigado por usar nosso caixa!");

        teclado.close();
    }
}
