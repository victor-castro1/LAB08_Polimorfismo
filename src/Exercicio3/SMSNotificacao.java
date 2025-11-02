package Exercicio3;

public class SMSNotificacao implements Notificacao{
    private String numeroTelefone;

    public SMSNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Mandando SMS Notificação: " + numeroTelefone);
        System.out.println("[!] - " + mensagem);
        System.out.println("SMS enviado com sucesso.");
        System.out.println();
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }
}
