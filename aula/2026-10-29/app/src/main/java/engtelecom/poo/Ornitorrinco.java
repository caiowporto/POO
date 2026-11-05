package engtelecom.poo;

public class Ornitorrinco extends Animal implements Corredor, Nadador, Oviparo, Mamifero{
    public Ornitorrinco(String nome) {
        super(nome);
    }

    public String atacarComEsporaoVenenoso(){
        return "Ornitorrinco ataca com seu esporão venenoso.";
    }

    @Override
    public String comer() {
        return "Ornitorrinco come.";
    }

    @Override
    public String correr() {
        return "Ornitorrinco corre.";
    }

    @Override
    public String amamentar() {
        return "Ornitorrinco amamenta.";
    }

    @Override
    public String nadar() {
        return "Ornitorrinco nada.";
    }

    @Override
    public String colocarOvo() {
        return "Ornitorrinco coloca ovo.";
    }
}
