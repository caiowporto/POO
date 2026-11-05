package engtelecom.poo;

public class Leao extends Animal implements Corredor, Mamifero{
    public Leao(String nome) {
        super(nome);
    }

    public String rugir(){
        return "Leão ruge.";
    }

    @Override
    public String comer() {
        return "Leao come.";
    }

    @Override
    public String correr() {
        return "Leao corre.";
    }

    @Override
    public String amamentar() {
        return "Leao amamenta.";
    }
}
