package engtelecom.poo;

import static java.lang.Math.sqrt;

public class Caneta {

    // atributos

    private double nivelTinta;
    private String cor;
    private final double CONSUMO;


    // métodos


    public Caneta(double CONSUMO, String cor, double nivelTinta) {
        this.CONSUMO = CONSUMO;
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(String cor, double nivelTinta) {
        this(0.01, cor, nivelTinta);
    }

    public Caneta() {
        this(0.01, "preta", 100);
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
//        this.capacidade = capacidade;
        this.nivelTinta = Math.min(Math.max(0, nivelTinta), 100);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double desenhar(int xInicio, int yInicio, int xFim, int yFim){
        double distancia = sqrt((Math.pow((xFim - xInicio), 2)+(Math.pow((yFim - yInicio), 2))));
        double consumo = distancia * CONSUMO;
        if (consumo > nivelTinta){
            return -1;
        } else{
            nivelTinta = nivelTinta - consumo;
            return consumo;
        }
    }

}
