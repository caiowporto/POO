package engtelecom.poo;

public class Macaco extends Animal implements Corredor, Mamifero{
    public Macaco(String nome) {
        super(nome);
    }

    public String pincar(){
        return "Macaco pinça objetos.";
    }

    @Override
    public String comer() {
        return "Macaco come.";
    }

    @Override
    public String correr() {
        return "Macaco corre.";
    }

    @Override
    public String amamentar() {
        return "Macaco amamenta.";
    }
}
