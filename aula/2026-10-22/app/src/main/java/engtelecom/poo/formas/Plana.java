package engtelecom.poo.formas;

public abstract class Plana extends Forma{

    // métodos

    public Plana(Coordenada coordenadaInicial, String corDaLinha) {
        super(coordenadaInicial, corDaLinha);
    }

    public abstract int calcularArea();

    public abstract double calcularPerimetro();
}
