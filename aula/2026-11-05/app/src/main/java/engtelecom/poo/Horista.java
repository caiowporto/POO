package engtelecom.poo;

public class Horista extends Funcionario{

    // atributos

    private int horasTrabalhadas;
    private double valorHorasTrabalhadas;
    private int horasExtras;
    private double valorHorasExtras;

    // métodos

    public Horista(String nome, int horasTrabalhadas, double valorHorasTrabalhadas, int horasExtras, double valorHorasExtras) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
        this.horasExtras = horasExtras;
        this.valorHorasExtras = valorHorasExtras;
    }

    @Override
    public double calcularSalario() {
        return ((horasTrabalhadas * valorHorasTrabalhadas) + (horasExtras * valorHorasExtras));
    }

}
