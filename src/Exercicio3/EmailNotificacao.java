package Exercicio3;

public class EmailNotificacao implements Notificacao {
    private String enderecoEmail;

    public EmailNotificacao(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail para: " + enderecoEmail);
        System.out.println("[!] - " + mensagem);
        System.out.println("Email está sendo encaminhado.");
        System.out.println("Email já foi encaminhado.");
        System.out.println();
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }
}
