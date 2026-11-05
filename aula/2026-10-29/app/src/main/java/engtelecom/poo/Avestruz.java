package engtelecom.poo;

public class Avestruz extends Animal implements Corredor, Oviparo{

    public Avestruz(String nome) {
        super(nome);
    }

    public String enterrarCabeca(){
        return "Avestruz enterra a sua cabeça no chão.";
    }

    @Override
    public String comer() {
        return "Avestruz come.";
    }

    @Override
    public String correr() {
        return "Avestruz corre.";
    }

    @Override
    public String colocarOvo() {
        return "Avestruz coloca ovo.";
    }
}
