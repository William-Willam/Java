package Exercicios.ExercicioPOO.ParteC;

public class Caminhao implements Veiculo {
    @Override
    public void iniciar() {
        System.out.println("O caminhão está aquecendo o motor diesel... VRUM!");
    }

    @Override
    public void parar() {
        System.out.println("O caminhão acionou os freios a ar: Pshhhhhhh!");
    }
}
