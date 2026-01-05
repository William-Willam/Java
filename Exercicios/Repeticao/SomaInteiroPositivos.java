package Exercicios.Repeticao;

public class SomaInteiroPositivos {
    public static void main(String[] args) {
        // variável
        int numero = 10;
        int resultado = 0;

        // processamento
        do {
            resultado += numero;
            numero --;
        } while (numero > 0);

        System.out.println("Resultado dos numeros positivos: " + resultado);

    }

}
