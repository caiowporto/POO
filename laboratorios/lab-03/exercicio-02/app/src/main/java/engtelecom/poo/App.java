package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Horario h = new Horario(23);
        h.setMinuto(59);
        h.setSegundo(59);
        IO.println(h);

        IO.println(h.retornaExtenso(1));
    }
}
