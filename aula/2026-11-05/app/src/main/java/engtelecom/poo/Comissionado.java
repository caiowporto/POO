package engtelecom.poo;

public class Comissionado extends Funcionario{

    // atributos

    private double totalVendas;
    private double percentualVendas;

    public Comissionado(String nome, double totalVendas, double percentualVendas) {
        super(nome);
        this.totalVendas = totalVendas;
        this.percentualVendas = percentualVendas;
    }

    @Override
    public double calcularSalario() {
        return (totalVendas * (percentualVendas / 100));
    }
}
