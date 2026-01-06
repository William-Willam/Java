package Exercicios.ExercicioPOO.ParteE;

public class Main {
    public static void main(String[] args) {
        // Criando um produto com 50 unidades iniciais
        ProdutoImpl meuProduto = new ProdutoImpl("Teclado Mecânico", 50);

        System.out.println("Produto: " + meuProduto.getNome());
        System.out.println("Estoque Inicial: " + meuProduto.getQuantidade());

        // Testando Adição
        meuProduto.adicionarQuantidade(20);
        System.out.println("Estoque após adição: " + meuProduto.getQuantidade());

        // Testando Remoção permitida
        meuProduto.removerQuantidade(15);
        System.out.println("Estoque após remoção: " + meuProduto.getQuantidade());

        // Testando Remoção negada (estoque insuficiente)
        System.out.println("\nTentando remover 80 unidades...");
        meuProduto.removerQuantidade(80);

        // Resultado Final
        System.out.println("Estoque Final: " + meuProduto.getQuantidade());
    }
}
