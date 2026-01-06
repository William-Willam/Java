package Exercicios.ExercicioPOO.ParteD;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoRestaurante {
    // Listas para armazenar os dados
    private List<String> itens = new ArrayList<>();
    private List<Double> precos = new ArrayList<>();

    @Override
    public void adicionarItem(String item, double preco) {
        itens.add(item);
        precos.add(preco);
        System.out.println("Adicionado: " + item + " - R$ " + preco);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        // Percorrendo a lista de preços para somar
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }
}
