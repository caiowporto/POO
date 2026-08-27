package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        Ponto a = new Ponto(2, 1);
        Ponto b = new Ponto(3, 2);
        IO.println(a);
        IO.println(a.distancia(b));
    }
}
