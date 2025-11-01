package Exercicio2;

class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            String cartaoMascarado = "**** **** **** " + numeroCartao.substring(numeroCartao.length() - 4);
            System.out.println("Processando pagamento com Cartão de Crédito");
            System.out.println("Titular: " + nomeTitular);
            System.out.println("Cartão: " + cartaoMascarado);
            System.out.println("Validade: " + validade);
            System.out.printf("Valor: R$ %.2f\n", valor);
            System.out.println("Pagamento com cartão processado com sucesso!");
            return true;
        } else {
            System.out.println("Pagmamento recusado, tente novamente mais tarde");
            return false;
        }
    }
}
