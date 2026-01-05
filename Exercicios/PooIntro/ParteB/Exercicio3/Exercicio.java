package Exercicios.PooIntro.ParteB.Exercicio3;

public class Exercicio {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("William", 29);

        aluno.matricula = "2026.1.1";

        System.out.println("====== Dados do estudante ======");
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
    }
}
