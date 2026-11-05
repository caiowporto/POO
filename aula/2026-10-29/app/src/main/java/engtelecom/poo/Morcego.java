package engtelecom.poo;

public class Morcego extends Animal implements Voador, Mamifero{
    public Morcego(String nome) {
        super(nome);
    }

    public String dormirDeCabecaParaBaixo(){
        return "Morcego dorme de cabeça para baixo.";
    }

    @Override
    public String comer() {
        return "Morcego come.";
    }

    @Override
    public String amamentar() {
        return "Morcego amamenta.";
    }

    @Override
    public String voar() {
        return "Morcego voa.";
    }
}
