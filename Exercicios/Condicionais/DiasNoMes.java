package Exercicios.Condicionais;

/*
    Exercício: Número de Dias no Mês

    Instruções:
    - Crie uma classe chamada DiasNoMes.
    - Dentro da classe, declare uma variável chamada 'mes' e inicialize-a com um valor (por exemplo, "Abril").
    - Use um bloco switch para determinar o número de dias no mês com base no valor de 'mes'.

    Considere os seguintes cenários:
    • Se mes for "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro" ou "Dezembro", o número de dias é 31.
    • Se mes for "Abril", "Junho", "Setembro" ou "Novembro", o número de dias é 30.
    • Se mes for "Fevereiro", o número de dias é 28 (considerando um ano não bissexto).
    • Se mes não corresponder a nenhum dos casos anteriores, exiba "Mês desconhecido".

    - Imprima o resultado na saída.
    - Tipo de switch a ser usado: switch inicialização (com setinha ->).
*/

public class DiasNoMes {
    public static void main(String[] args) {
        String mes = "Abril";

        String dias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31 dias";
            case "Abril", "Junho", "Setembro", "Novembro" -> "30 dias";
            case "Fevereiro" -> "28 dias";
            default -> "Mês desconhecido";
        };

        System.out.println("O mês de " + mes + " tem " + dias + ".");
    }
}
