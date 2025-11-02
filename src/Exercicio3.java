import Exercicio3.*;

import java.sql.Array;
import java.util.ArrayList;

// Classe principal
public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Sistema de Notificações");

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new EmailNotificacao("usuario@email.com")); // Add novos tipos de notifações (Email)
        notificacoes.add(new SMSNotificacao("+55 11 98765-4321")); // Add novos tipos de notifações (SMS)
        notificacoes.add(new PushNotificacao("TOKEN-ABC123-XYZ789")); // Add novos tipos de notifações (Push)

        String mensagem = "Você tem uma nova atualização no sistema!"; // Mensagem --> enviada --> todos

        System.out.println("Enviando notificações para os usuários.\n");
        System.out.println("-".repeat(30) + "-".repeat(30));

        // Iterando sobre o ArrayList e demonstrando polimorfismo
        for (int i = 0; i < notificacoes.size(); i++) {
            System.out.println("|--- Notificação " + (i + 1) + " ---|");
            notificacoes.get(i).enviar(mensagem);
        }

        System.out.println("-".repeat(30) + "-".repeat(30));
        System.out.println("Total de notificações enviadas: " + notificacoes.size());
    }
}