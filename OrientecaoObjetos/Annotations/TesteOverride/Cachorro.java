package OrientecaoObjetos.Annotations.TesteOverride;

public class Cachorro extends Animal {
    @Override
    public void fazerSom(){
        System.out.println("O cachorro Late!");
    }
}
