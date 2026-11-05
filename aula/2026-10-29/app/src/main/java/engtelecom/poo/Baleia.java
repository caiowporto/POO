package engtelecom.poo;

public class Baleia extends Animal implements Nadador, Mamifero{
    public Baleia(String nome) {
        super(nome);
    }

    public String ecolocalizar(){
        return "Baleia se ecolocaliza.";
    }

    @Override
    public String comer() {
        return "Baleia come.";
    }

    @Override
    public String amamentar() {
        return "Baleia amamenta.";
    }

    @Override
    public String nadar() {
        return "Baleia nada.";
    }
}
