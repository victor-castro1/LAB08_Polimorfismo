package Exercicio2;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Processamento do pagamento via Pix");
            System.out.println("Chave Pix" + chavePix);
            System.out.println("Valor: R$ %.2f\\n" + valor);
            System.out.println("Pagamento Pix realizado ocm sucesso, ocm a chave: " + chavePix + ".");
            return true;
        } else {
            System.out.println("Valor invalido, tente novamente");
            return false;
        }
    }

    public String getChavePix() {
        return chavePix;
    }
}
