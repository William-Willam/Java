package Exercicios.LogicaProgramacao.Logica;

public class Atividade6 {
    public static void main(String[] args) {

        // declaração
        String nome[] = {"William", "Ireneu", "Jubileu", "São Paulo", "Sem Mundial"};

        System.out.println("Nomes de ordem inversa: ");

        for(int i = nome.length - 1; i >= 0; i--){
            System.out.println("Índice " + i +": " + nome[i]);
        }

        System.out.println("=========================");

        String primeiroNome = nome[0];
        int qtdCaracteres = primeiroNome.length();

        System.out.println("Primeiro nome da lista é: " + primeiroNome);
        System.out.println("ELe possui " +qtdCaracteres+ " caracteres.");

        
    }
}
/*
    Enunciado: Crie um programa que armazene 5 nomes em um array de Strings. 
    O programa deve imprimir esses nomes na ordem inversa (do último para o primeiro) 
    e informar quantos caracteres tem o nome que está na primeira posição do array.
*/