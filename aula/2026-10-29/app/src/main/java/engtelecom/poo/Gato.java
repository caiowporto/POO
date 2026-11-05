package engtelecom.poo;

public class Gato extends Animal implements Corredor, Mamifero {
    public Gato(String nome) {
        super(nome);
    }

    public String miar(){
        return "Gato mia.";
    }

    @Override
    public String comer() {
        return "Gato come.";
    }

    @Override
    public String correr() {
        return "Gato corre.";
    }

    @Override
    public String amamentar() {
        return "Gato amamenta.";
    }
}
