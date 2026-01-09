package Exercicios.LogicaProgramacao.PooELogica.Atividade1;

public class TesteMain {
    public static void main(String[] args) {
        WhatsApp mensagem = new WhatsApp();
        Email mensagem1 = new Email();

        mensagem.enviar();
        mensagem1.enviar();
    }
}

/* Correção */

/*
 * 
 * 
 * // Usamos o tipo da Interface para a lista
 * List<Mensagem> listaDeMensagens = new ArrayList<>();
 * 
 * // Adicionamos diferentes implementações na mesma lista
 * listaDeMensagens.add(new WhatsApp());
 * listaDeMensagens.add(new Email());
 * listaDeMensagens.add(new WhatsApp()); // Posso repetir tipos
 * 
 * System.out.println("--- Disparando Mensagens em Massa ---");
 * 
 * // Percorremos a lista chamando o enviar() de cada um
 * for (Mensagem msg : listaDeMensagens) {
 * msg.enviar();
 * }
 * 
 * 
 */