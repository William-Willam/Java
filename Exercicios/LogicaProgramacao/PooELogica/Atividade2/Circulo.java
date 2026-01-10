package Exercicios.LogicaProgramacao.PooELogica.Atividade2;

public class Circulo extends Forma {
    double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    void calcularArea() {
        // Usando Math.PI para maior precisão
        double area = Math.PI * Math.pow(raio, 2);
        // Usando printf para limitar as casas decimais
        System.out.printf("Área do %s: %.2f%n", nome, area);
    }
}