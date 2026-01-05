package OrientecaoObjetos.Introducao;

public class Metodos {

    // Atributo privado: Ninguém pode mudar o saldo diretamente (Encapsulamento)
    private double saldo;

    // 1. Método que retorna um valor (Getter)
    public double consultarSaldo() {
        return saldo;
    }

    // 2. Método com parâmetro e sem retorno (void)
    // Usamos para adicionar dinheiro à conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // 3. Método que retorna um booleano (true/false)
    // Indica se a operação de saque foi bem-sucedida
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Método main para testar a nossa classe
    public static void main(String[] args) {
        Metodos minhaConta = new Metodos();

        // Operações
        minhaConta.depositar(500.00);
        minhaConta.sacar(150.00);

        // Verificando o resultado final
        System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());
    }
}