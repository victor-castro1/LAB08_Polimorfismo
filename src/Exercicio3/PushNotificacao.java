package Exercicio3;

public class PushNotificacao implements Notificacao{
    private String tokenDispositivo;

    public PushNotificacao(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviar notificação push para: " + tokenDispositivo);
        System.out.println("[!] - " + mensagem);
        System.out.println("Notificação push enviado com sucesso.");
        System.out.println();
    }

    public String getTokenDispositivo() {
        return tokenDispositivo;
    }
}
