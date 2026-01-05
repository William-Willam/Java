package Exercicios.PooIntro.ParteA;

public class Carro{
    // atributos
    String marcaCarro;
    int modeloCarro;
    int ano;

    // construtor padrão
    public Carro(){}

    // construtor com 2 parametros
    public Carro( String marcaCarro, int modeloCarro){
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
    }

    // construtor com todos os parametros
    public Carro(String marcaCarro, int modeloCarro,  int ano){
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.ano = ano;
    }

    // metodo exibir
    public String exibirDetalhes(){
        return "Marca: " + marcaCarro + ", Modelo: " + modeloCarro + ", Ano: " + ano;
    }


}