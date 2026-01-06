package Exercicios.ExercicioPOO.ParteB.Exercicio2;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // AJUSTE: O método deve receber o valor do aumento e somar ao salário atual
    public void adicionarAumento(double valor) {
        this.salario += valor; 
    }

    // AJUSTE: Deve retornar o salário multiplicado por 12 meses
    public double ganhoAnual() {
        return this.salario * 12;
    }

    // Getters e Setters (Estão perfeitos!)
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}