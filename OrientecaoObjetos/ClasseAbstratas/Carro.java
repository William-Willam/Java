package OrientecaoObjetos.ClasseAbstratas;

public abstract class Carro {
    // metodos abstrados
    abstract void acelerar();

    // metodos não metodos
    void frear() {
        System.out.println("O carro está freiando!");
    }

}
