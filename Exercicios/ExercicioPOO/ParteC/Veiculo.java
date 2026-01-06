package Exercicios.ExercicioPOO.ParteC;

public interface Veiculo {
    void iniciar(); // Método abstrato
    void parar();   // Método abstrato

    // Método padrão (default) - não precisa ser implementado obrigatoriamente pelas classes
    default void buzinar() {
        System.out.println("Buzinando: Bibibi!");
    }
}