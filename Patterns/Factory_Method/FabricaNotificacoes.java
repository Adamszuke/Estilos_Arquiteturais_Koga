package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {

    protected abstract IntNotificacoes criarNotificacoes();

    public final void notificar() {
        IntNotificacoes notificacao = criarNotificacoes();
        notificacao.enviar();
    }
}