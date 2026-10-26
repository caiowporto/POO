package engtelecom.poo.formas;

public class Linha extends Forma{

    // atributos

    private Coordenada coordenadaFinal;

    // métodos

    public Linha(Coordenada coordenadaInicial, Coordenada coordenadaFinal, String corDaLinha) {
        super(coordenadaInicial, corDaLinha);
        this.coordenadaFinal = coordenadaFinal;
    }

    @Override
    public String desenhar() {
        return "Linha " + corDaLinha + ": " + coordenadaInicial.toString() + " " + coordenadaFinal.toString();
    }
}
