package Exercicios.Repeticao;

public class ContadorDoces {
    public static void main(String[] args) {
        int contadorDoces = 1; // inicialização

        while (contadorDoces <= 3) { // condição
            System.out.println("Sua mãe liberou " + contadorDoces + " doces");
            contadorDoces++; // atualização
        }
    }
}
