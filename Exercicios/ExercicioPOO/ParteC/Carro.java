package Exercicios.ExercicioPOO.ParteC;

public class Carro implements Veiculo {
    @Override
    public void iniciar() {
        System.out.println("O carro está ligando o motor vapt-vupt.");
    }

    @Override
    public void parar() {
        System.out.println("O carro freou e parou.");
    }
}