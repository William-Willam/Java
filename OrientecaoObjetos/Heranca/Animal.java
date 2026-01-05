package OrientecaoObjetos.Heranca;

public class Animal {
    //atributo
    public String nome;

    // construtor
    Animal (String nome){
        this.nome = nome;
    }
    // metodo
    public void fazerSom(){
        System.out.println("O animal faz som !");
    }
}
