package engtelecom.poo;

public class Arara extends Animal implements Voador, Oviparo{

    public Arara(String nome) {
        super(nome);
    }

    public String falar(){
        return "Arara fala.";
    }

    @Override
    public String comer() {
        return "Arara come.";
    }

    @Override
    public String colocarOvo() {
        return "Arara coloca Ovo.";
    }

    @Override
    public String voar() {
        return "Arara voa.";
    }
}
