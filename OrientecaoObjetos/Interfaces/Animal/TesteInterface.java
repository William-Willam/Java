package OrientecaoObjetos.Interfaces.Animal;

public class TesteInterface {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();

        dog.fazerSom();
        cat.fazerSom();
    }
}
