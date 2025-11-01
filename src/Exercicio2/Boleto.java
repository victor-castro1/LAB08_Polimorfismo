package Exercicio2;

public class Boleto implements MetodoPagamento {
    private String codigoBarra;
    private String dataVencimento;

    public Boleto(String codigoBarra, String dataVencimento) {
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Gerando o boleto bancário...");
            System.out.println("Código de barras: " + codigoBarra);
            System.out.printf("Valor: R$ %.2f\n", valor);
            System.out.println("Data de vencimento de boleto: " + dataVencimento);
            System.out.println("Pagamento com boleto gerado. Pague até " + dataVencimento + ".");
            return true;
        } else {
            System.out.println("Pagamento recusado. Tente Novamente.");
            return false;
        }
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }
}
