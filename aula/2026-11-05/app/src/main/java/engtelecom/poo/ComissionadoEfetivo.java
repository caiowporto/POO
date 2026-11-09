package engtelecom.poo;

public class ComissionadoEfetivo extends Funcionario{

    // atributos

    private double salarioInicial;
    private double totalVendas;
    private double percentualVendas;

    // métodos

    public ComissionadoEfetivo(String nome, double salarioInicial, double totalVendas, double percentualVendas) {
        super(nome);
        this.salarioInicial = salarioInicial;
        this.totalVendas = totalVendas;
        this.percentualVendas = percentualVendas;
    }

    @Override
    public double calcularSalario() {
        return (salarioInicial + (totalVendas * (percentualVendas / 100)));
    }
}
