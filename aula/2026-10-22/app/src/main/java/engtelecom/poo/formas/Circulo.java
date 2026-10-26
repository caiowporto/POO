package engtelecom.poo.formas;

public class Circulo extends Forma{

    // atributos

    private int raio;

    public Circulo(Coordenada coordenadaInicial, String corDaLinha, int raio) {
        super(coordenadaInicial, corDaLinha);
        this.raio = raio;
    }

    // métodos

    @Override
    public String desenhar() {
        return "Circulo " + corDaLinha + ": " + coordenadaInicial.toString();
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return Math.PI * (2 * raio);
    }
}
