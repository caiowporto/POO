package engtelecom.poo;

public class Ponto {

    // atributos

    private double x;
    private double y;
    // métodos

    public Ponto(double x , double y ) {
        this.x = x;
        this.y  = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Ponto p){
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }
}
