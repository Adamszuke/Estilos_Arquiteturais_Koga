package Patterns.Abstract_Factory;

public class Aplicacao {
    private final Botao botao;
    private final Input input;

    public Aplicacao(Fabricas fabrica) {   // DIP: recebe abstração
        this.botao = fabrica.criarBotao();
        this.input = fabrica.criarInput();
    }

    public void renderizar() {
        botao.renderizarBotao();
        input.renderizarInput();
    }
}