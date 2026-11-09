package engtelecom.poo;

public class MensalistaFixo extends Funcionario{

    // atributos

    private double salarioTotal;

    // métodos

    public MensalistaFixo(String nome, double salarioTotal) {
        super(nome);
        this.salarioTotal = salarioTotal;
    }

    @Override
    public double calcularSalario() {
        return salarioTotal;
    }

}
