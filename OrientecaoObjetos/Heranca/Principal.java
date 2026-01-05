package OrientecaoObjetos.Heranca;

public class Principal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Jubileu", "Vira-Lata");

        System.out.println("O nome do animal: " + dog.nome + ", Sua raça é : " + dog.raca);
        //dog.fazerSom();
    }
}
