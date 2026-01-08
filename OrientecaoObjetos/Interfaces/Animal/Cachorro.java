package OrientecaoObjetos.Interfaces.Animal;

public class Cachorro implements Animal {

    public void respirar(){}

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au, Au!");
    }
    
}
