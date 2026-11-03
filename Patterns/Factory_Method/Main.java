package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacoes email = new FabricaEmail();
        FabricaNotificacoes sms = new FabricaSMS();

        email.notificar();
        sms.notificar();
    }
}