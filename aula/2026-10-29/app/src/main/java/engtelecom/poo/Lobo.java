package engtelecom.poo;

public class Lobo extends Animal implements Corredor, Mamifero {
    public Lobo(String nome) {
        super(nome);
    }

    public String uivar(){
        return "Lobo uiva.";
    }

    @Override
    public String comer() {
        return "lobo come.";
    }

    @Override
    public String correr() {
        return "Lobo corre.";
    }

    @Override
    public String amamentar() {
        return "Lobo amamenta.";
    }
}
