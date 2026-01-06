package Exercicios.ExercicioPOO.ParteD;

public class Main {
    public static void main(String[] args) {
        // Criando o pedido
        PedidoRestaurante meuPedido = new Pedido();

        System.out.println("=== Iniciando Pedido ===");
        
        // Adicionando itens
        meuPedido.adicionarItem("Hambúrguer", 25.50);
        meuPedido.adicionarItem("Batata Frita", 12.00);
        meuPedido.adicionarItem("Refrigerante", 7.00);

        // Calculando e exibindo o total
        double totalFinal = meuPedido.calcularTotal();
        
        System.out.println("========================");
        System.out.printf("Valor Total do Pedido: R$ %.2f%n", totalFinal);
    }
}