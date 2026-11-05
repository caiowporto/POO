package engtelecom.poo;

public class Cachorro extends Animal implements Corredor, Mamifero{
    public Cachorro(String nome) {
        super(nome);
    }

    public String latir(){
        return "Cachorro late.";
    }

    @Override
    public String comer() {
        return "Cachorro come.";
    }

    @Override
    public String correr() {
        return "Cachorro corre.";
    }

    @Override
    public String amamentar() {
        return "Cachorro amamenta.";
    }
}
