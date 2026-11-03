package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Fabricas android = new FabricaAndroid();
        Fabricas ios = new FabricaIOS();

        new Aplicacao(android).renderizar();
        new Aplicacao(ios).renderizar();
    }
}