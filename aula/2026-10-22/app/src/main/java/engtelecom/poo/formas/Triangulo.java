package engtelecom.poo.formas;

public class Triangulo extends Forma{

    // atributos

    private Coordenada v2;
    private Coordenada v3;

    // métodos

    public Triangulo(Coordenada coordenadaInicial, Coordenada v2, Coordenada v3, String corDaLinha) {
        super(coordenadaInicial, corDaLinha);
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String desenhar() {
        return "Triangulo " + corDaLinha + ": " + coordenadaInicial.toString() + v2.toString() + v3.toString();
    }
}
