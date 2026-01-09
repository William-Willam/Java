package Exercicios.LogicaProgramacao.PooELogica.Atividade2;

public class Quadrado extends Forma {

    double lado;

    public Quadrado(String nome) {
        super(nome);
    }

    @Override
    void calcularArea() {
        double area = lado * lado;
        System.out.println("Aréa do " + nome + ": " + area);
    }

}
