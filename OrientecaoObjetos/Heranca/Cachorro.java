package OrientecaoObjetos.Heranca;

public class Cachorro extends Animal {
    String raca;

    Cachorro(String nome, String raca) {
        super(nome); // chama o construtor da superclasse Animal
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        super.fazerSom();// chamar imediatamente o metodo da classe Animal
        System.out.println("O Cachorro Late !");
    }
}
