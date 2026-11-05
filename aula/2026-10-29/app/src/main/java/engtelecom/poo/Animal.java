package engtelecom.poo;

public abstract class Animal {

    // atributos

    protected String nome;

    // métodos


    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String comer();
}
