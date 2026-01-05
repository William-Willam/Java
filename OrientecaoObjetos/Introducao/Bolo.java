package OrientecaoObjetos.Introducao;

// É classe Bolo
public class Bolo {
    int qtdAcucar;

    public static void main(String[] args) {

        // objeto "Bolo" ou intancia
        Bolo boloChocolate = new Bolo();
        boloChocolate.qtdAcucar = 200;

        Bolo boloBaunilha = new Bolo();
        boloBaunilha.qtdAcucar = 150;

        System.out.println("Quantidade de açucar no bolo de chocolate: " + boloChocolate.qtdAcucar);
        System.out.println("Quantidade de açucar no bolo de baunilha: " + boloBaunilha.qtdAcucar);
    }
}
