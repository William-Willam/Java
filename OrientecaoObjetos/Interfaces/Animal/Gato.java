package OrientecaoObjetos.Interfaces.Animal;

public class Gato implements Animal {

    public void respirar(){}

    @Override
    public void fazerSom() {
        System.out.println("O gato faz: miau, miau!");
    }
    
}
