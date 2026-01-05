package Exercicios.PooIntro.ParteB.Exercicio4;

// Passo 1: Defina a SuperClasse
class SuperClasse {
    // Este método será sobrescrito na classe filha (MinhaClasse)
    public void imprime() {
        System.out.println("imprime");
    }
}

// Passo 2: Crie a MinhaClasse que estende SuperClasse
class MinhaClasse extends SuperClasse {

    // Passo 3: Utilize a anotação @Override
    @Override
    public void imprime() {
        System.out.println("imprime diferente");
    }
}

public class TesteOverride {
    public static void main(String[] args) {
        // Passo 4: Crie uma instância de MinhaClasse e chame o método
        MinhaClasse objeto = new MinhaClasse();
        objeto.imprime();
    }
}