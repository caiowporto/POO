package engtelecom.poo;

public class Carro {

    // atributos

    private String marca;
    private Motor propulsor;

    // métodos públicos


    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    public void acelerar(int v){
        this.propulsor.acelerar(v);
    }
}
