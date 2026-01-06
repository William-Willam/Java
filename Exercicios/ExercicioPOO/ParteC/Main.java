package Exercicios.ExercicioPOO.ParteC;

public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo meuCaminhao = new Caminhao();

        System.out.println("--- Testando o Carro ---");
        meuCarro.iniciar();
        meuCarro.buzinar(); // Usa o método padrão da interface
        meuCarro.parar();

        System.out.println("\n--- Testando o Caminhão ---");
        meuCaminhao.iniciar();
        meuCaminhao.buzinar(); // Também usa o método padrão
        meuCaminhao.parar();
    }
}
