package Exercicios.PooIntro.ParteA;

public class Produtos {
    
    // atributos

    private String nome;
    private double preco;
    private int qtdEmEstoque;

    // construtor

    public Produtos(String nome, double preco, int qtdEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }


    // classe "Principal"

    public static void main(String[] args) {
        Produtos p1 = new Produtos("Teclado", 200, 10);
        
        System.out.println();
        System.out.println("================ Produtos ================");
        System.out.println("Nome: "+ p1.nome +" | R$: "+ p1.preco +" | Quantidade: "+p1.qtdEmEstoque);
    }

}
