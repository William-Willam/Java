package Aulas_Controle_de_fluxo.Condicionais;

public class Condicional_IF_ELSE {
    public static void main(String[] args) {
        // variavéis
        var a = 10;
        int b = 20;
        Object obj = "Hello";

        // condição if - else
        if(a > 5 || b> 10){
            System.out.println("o valor de a é maior que 5");
            System.out.println("o valor de b é maior que 10");
        }else{
            System.out.println("os valores de a e b são menores que 5 e 10!");
        }

        System.out.println();
        
        // instrução instanceof : verifica se um objeto é de um tipo específico
        if (obj instanceof String) {
            System.out.println(obj);
            System.out.println();
        }
    }
}
