package Exercicios.ExercicioPOO.ParteA;

public class Secretaria {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();

        aluno.setNome("Maria");
        aluno1.setNome("João");
        

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nome do(a) aluno(a): " + aluno1.getNome());
    }
}