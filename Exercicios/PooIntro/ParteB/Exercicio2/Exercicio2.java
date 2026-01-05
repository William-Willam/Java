package Exercicios.PooIntro.ParteB.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Assistente assistente1 = new Assistente("William", 1800);

        System.out.println("Nome do funcionário: " + assistente1.getNome());
        System.out.println("Salário do funcionário atual: " + assistente1.getSalario());

        assistente1.adicionarAumento(500);
        System.out.println("========================");
        System.out.println("Ganho Anual (com bônus): R$" + assistente1.ganhoAnual());
    }
}
