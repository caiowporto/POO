package engtelecom.poo;

public class Coordenada {

    // atributos

    public int x;
    public int y;


    // métodos

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenada(x,y) = (" + x + ", " + y + ")";
    }
}
