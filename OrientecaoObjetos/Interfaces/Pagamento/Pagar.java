package OrientecaoObjetos.Interfaces.Pagamento;

public interface Pagar {
    public interface MetodoPagamento {
        void pagar(double valor); // Opcionalmente: public abstract void pagar...
    }

    public class CartaoCredito implements MetodoPagamento {
        @Override
        public void pagar(double valor) {
            System.out.println("Pagando R$ " + valor + " no crédito. Processando operadora...");
        }
    }

    public class Pix implements MetodoPagamento {
        @Override
        public void pagar(double valor) {
            System.out.println("Pagando R$ " + valor + " via Pix. Gerando QR Code...");
        }
    }

    public class Checkout {
        // Perceba que o parâmetro é a INTERFACE
        public void finalizarCompra(MetodoPagamento metodo, double total) {
            metodo.pagar(total);
        }
    }
}
