package Exercicios.LogicaProgramacao;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        // declaração
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Escolha um numero ,1 até 10, para mostrar a tabuada: ");
        numero =  teclado.nextInt();

        System.out.println("===== Tabuada de "+ numero + " =====");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            if (resultado % 3 == 0) {
               System.out.println(numero +" x "+ i + " = " + resultado); 
            }
        }

        teclado.close();
    }
}

/*Objetivo: Praticar laços de repetição (for). 
Enunciado: Peça ao usuário um número inteiro. 
O programa deve imprimir a tabuada desse número de 1 a 10, 
mas apenas os resultados que forem múltiplos de 3. */