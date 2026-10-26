package engtelecom.poo.formas;

public class Forma {

    // atributos

    protected Coordenada coordenadaInicial;
    protected String corDaLinha;

    // métodos


    public Forma(Coordenada coordenadaInicial, String corDaLinha) {
        this.coordenadaInicial = coordenadaInicial;
        this.corDaLinha = corDaLinha;
    }

    public String desenhar(){return "";}
}
