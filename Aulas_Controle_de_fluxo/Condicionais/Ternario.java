package Aulas_Controle_de_fluxo.Condicionais;
    // O operador ternário (ternary) é uma forma concisa de escrever uma instrução if-else em uma única linha. 
    // Ele é útil para simplificar expressões condicionais curtas
    // Sintaxa : condição ? valorSeVerdadeiro : valorSeFalso;

public class Ternario {
    public static void main(String[] args) {
        // variavéis
        int numero = 27;
        String resultado;

        // resolução
        resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("O numero é: "+ resultado);
    }
    
}
