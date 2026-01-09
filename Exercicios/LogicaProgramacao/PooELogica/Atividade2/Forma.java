package Exercicios.LogicaProgramacao.PooELogica.Atividade2;

public abstract class Forma {
    // atributo
    String nome;

    //construtor
    public Forma(String nome){
        this.nome = nome;
    }

    // metodo sem abstract
    void imprimirNome(){
        System.out.println("Forma: " +this.nome);
    }

    // metodo abstract
    abstract void calcularArea();
}
