package engtelecom.poo;

public class App {
    public static void main(String[] args){

        Caneta bic = new Caneta(0.02, "azul", 100);
        Caneta piloto = new Caneta();

        bic.setNivelTinta(120);
        IO.println(bic.getNivelTinta());
        IO.println(bic.desenhar(2, 1, 40, 50));
        IO.println(bic.getNivelTinta());
        IO.println();
        IO.println("nivel de tinta :" +piloto.getNivelTinta());
        IO.println(piloto.desenhar(2, 1, 40, 50));
        IO.println(piloto.getNivelTinta());
    }
}
