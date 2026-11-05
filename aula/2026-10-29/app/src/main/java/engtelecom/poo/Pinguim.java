package engtelecom.poo;

public class Pinguim extends Animal implements Corredor, Nadador, Oviparo{
    public Pinguim(String nome) {
        super(nome);
    }

    public String resistirAoFrioExtremo(){
        return "Pinguim resiste ao frio extremo.";
    }

    @Override
    public String comer() {
        return "Pinguim come.";
    }

    @Override
    public String correr() {
        return "Pinguim corre.";
    }

    @Override
    public String nadar() {
        return "Pinguim nada.";
    }

    @Override
    public String colocarOvo() {
        return "Pinguim coloca ovo.";
    }
}
