package engtelecom.poo.formas;

public class Retangulo extends Forma{

    // atributos

    private Coordenada coordenadaFinal;

    // métodos

    public Retangulo(Coordenada coordenadaInicial, Coordenada coordenadaFinal, String corDaLinha) {
        super(coordenadaInicial, corDaLinha);
        this.coordenadaFinal = coordenadaFinal;
    }

    @Override
    public String desenhar() {
        return "Retangulo " + corDaLinha + ": " + coordenadaInicial.toString() + " " + coordenadaFinal.toString();
    }

    public int calcularArea(){
        return Math.abs((coordenadaFinal.x - coordenadaInicial.x) * (coordenadaFinal.y - coordenadaInicial.y));
    }

    public double calcularPerimetro(){
        return Math.abs((2 * (coordenadaFinal.x - coordenadaInicial.x)) + (2 * (coordenadaFinal.y - coordenadaInicial.y)));
    }
}
