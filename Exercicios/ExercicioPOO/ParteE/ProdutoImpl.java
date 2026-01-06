package Exercicios.ExercicioPOO.ParteE;

public class ProdutoImpl implements Produto {
    private String nome;
    private int quantidade;

    // Construtor
    public ProdutoImpl(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    // Métodos da Interface
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    // Métodos de atualização de estoque
    public void adicionarQuantidade(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println(qtd + " unidades adicionadas ao estoque de " + nome);
        }
    }

    public void removerQuantidade(int qtd) {
        if (qtd > this.quantidade) {
            System.out.println("Erro: Quantidade insuficiente em estoque para " + nome + "!");
        } else {
            this.quantidade -= qtd;
            System.out.println(qtd + " unidades removidas do estoque de " + nome);
        }
    }
}