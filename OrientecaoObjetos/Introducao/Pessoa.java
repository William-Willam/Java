package OrientecaoObjetos.Introducao;

public class Pessoa {
    String nome;
    int idade;

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome; // variável principal nome
        this.idade = idade;
    }

    // construtor default
    public Pessoa() {
    }

    // sobrecarga de construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("William", 25);
        System.out.println("Nome: " + p1.nome + ", Idade: " + p1.idade);
    }

}
