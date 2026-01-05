package Exercicios.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        // declaração
        double[] notas;

        // popular o array notas
        notas = new double[]{0.5, 2.3, 7.8, 9.5};

        //for convenvional
        System.out.println("For - convencional");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("");

        // for - each
        System.out.println("For - each");
        for (double d : notas) {
            System.out.println(d);
        }
    }
}
