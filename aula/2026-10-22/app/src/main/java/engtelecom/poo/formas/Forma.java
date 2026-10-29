package engtelecom.poo.formas;

public abstract class Forma {

    // atributos

    protected Coordenada coordenadaInicial;
    protected String corDaLinha;

    // métodos


    public Forma(Coordenada coordenadaInicial, String corDaLinha) {
        this.coordenadaInicial = coordenadaInicial;
        this.corDaLinha = corDaLinha;
    }

    public abstract String desenhar();
}
