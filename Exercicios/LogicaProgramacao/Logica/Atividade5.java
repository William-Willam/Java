package Exercicios.LogicaProgramacao.Logica;

public class Atividade5 {
    public static void main(String[] args) {
        double notas[] = {2.0, 3.5, 4.5, 8.2, 9.0}; // Forma simplificada de inicializar
        
        double soma = 0;
        double maiorNota = notas[0]; // Começamos assumindo que a primeira é a maior

        // O laço deve apenas ACUMULAR a soma e COMPARAR o maior
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i]; // Soma a nota atual ao total
            
            // Lógica para encontrar a maior nota
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        // Cálculo da média fora do laço (uma única vez)
        double media = soma / notas.length;

        System.out.println("--- RESULTADOS ---");
        System.out.println("Maior nota encontrada: " + maiorNota);
        System.out.printf("Média final: %.2f\n", media); // %.2f limita a 2 casas decimais

        if (media >= 7) {
            System.out.println("Status: Aluno aprovado!");
        } else {
            System.out.println("Status: Reprovado!");
        }
    }
}