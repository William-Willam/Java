package Exercicios.LogicaProgramacao.PooELogica.Atividade2;

public class Quadrado extends Forma {
    double lado;

    // Construtor recebe o nome para a mãe e o lado para si mesma
    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    void calcularArea() {
        double area = lado * lado;
        System.out.println("Área do " + nome + ": " + area);
    }
}