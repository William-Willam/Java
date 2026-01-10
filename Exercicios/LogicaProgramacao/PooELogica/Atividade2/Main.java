package Exercicios.LogicaProgramacao.PooELogica.Atividade2;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos com nomes e medidas
        Forma q1 = new Quadrado("Quadrado de Teste", 5.0);
        Forma c1 = new Circulo("Círculo de Teste", 3.0);

        // Chamando os métodos
        q1.imprimirNome();
        q1.calcularArea();

        System.out.println("-------------------------");

        c1.imprimirNome();
        c1.calcularArea();
    }
}