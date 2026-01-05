package Exercicios.Condicionais;

/*
    Exercício Complementar 4: Verificação de Aprovação com Base em Notas e Presença

    Você está desenvolvendo um sistema de notas para uma escola. O sistema deve verificar se um aluno foi aprovado
    em uma disciplina com base em suas notas e presença. Implemente um programa que utilize operadores lógicos para
    determinar se um aluno foi aprovado ou não.

    Orientações:
    - Declare três variáveis inteiras: nota1, nota2 e frequencia.
    - Atribua valores às variáveis nota1 (primeira nota), nota2 (segunda nota) e frequencia (percentual de frequência do aluno).
    - Considere que a aprovação ocorre se:
        • A média das notas ((nota1 + nota2) / 2) for maior ou igual a 7.
        • A frequência for igual ou superior a 75%.
    - Utilize operadores lógicos para verificar se o aluno foi aprovado.
    - Exiba uma mensagem indicando se o aluno foi aprovado ou não.
*/

public class VerificacaoAprovacaoPresenca {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 6;
        int frequencia = 80; 

        double media = (nota1 + nota2) / 2.0;

        boolean aprovado = media >= 7 && frequencia >= 75;

        if (aprovado) {
            System.out.println("Aluno aprovado! Média: " + media + ", Frequência: " + frequencia + "%");
        } else {
            System.out.println("Aluno reprovado. Média: " + media + ", Frequência: " + frequencia + "%");
        }
    }
}
