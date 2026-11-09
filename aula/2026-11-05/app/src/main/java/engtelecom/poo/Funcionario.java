package engtelecom.poo;

public abstract class Funcionario {

    // atributos

    protected String nome;

    // métodos

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
