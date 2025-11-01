import Exercicio2.*;

public class Exercicio2 {

    // Aqui seria onde o programa começar por causa da estrutura --> "public static void main(String[] args) {}"
    public static void main(String[] args) {
        System.out.println();
        System.out.println("|---- Sistema de Pagamento (E-commerce) ----|");

        // Utilizando interface --> Criar instâncias
        MetodoPagamento cartao = new CartaoCredito("1234567890123456", "João Silva", "12/2028");
        MetodoPagamento boleto = new Boleto("34191.79001 01043.510047 91020.150008 1 96610000012345", "15/11/2025");
        MetodoPagamento pix = new Pix("joao.silva@email.com");

        // Ações
        realizarPagamento(cartao, 250.00);
        realizarPagamento(boleto, 150.50);
        realizarPagamento(pix, 89.90);
    }

    // Método --> realiza --> Pagamento --> Diferentes tipos de compra.
    public static void realizarPagamento(MetodoPagamento metodo, double valor) {
        System.out.println("\n--------------------------------");
        System.out.println("REALIZANDO PAGAMENTO");
        System.out.println("--------------------------------");

        boolean sucesso = metodo.processarPagamento(valor);

        if (sucesso) {
            System.out.println("\nTransação concluída com sucesso!");
        } else {
            System.out.println("\nTransação não foi concluída.");
        }
    }
}