package Aulas_Controle_de_fluxo.Condicionais;

public class Condicional_Switch_Case {
    public static void main(String[] args) {
        System.out.println();
        // variáveis
        int day = 7;

        // bloco switch - versão tradicional
        switch (day) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Os outros dias estão em fase de criação!");
                break;
        }

        System.out.println();

        // versão - switch expressions
        // variáveis
        int numero = 7;

        switch (numero) {
            case 1 -> System.out.println("Domingo!");
            case 2 -> System.out.println("Segunda!");
            case 3 -> System.out.println("Terça!");
            case 4 -> System.out.println("Quarta!");
            case 5 -> System.out.println("Quinta!");
            case 6 -> System.out.println("Sexta!");
            case 7 -> System.out.println("Sabádo!");
            default -> System.out.println("não existe este dia!");
        }

        System.out.println();
        
        // também funciona por meio de strings
        // variável
        String dia = "ter";

        String tipoDia = switch (dia) {
            case "seg", "ter", "qua", "qui", "sex" -> "dia útil";
            case "sab", "dom" -> "Fim de semana";
            default -> "desconhecido";
        };

        System.out.println(tipoDia);

        System.out.println();
    }
}
