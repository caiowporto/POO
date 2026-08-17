package engtelecom.poo;

public class App {

    public static void main(String[] args){
        Contador primeiro = new Contador();

        IO.println(primeiro.obterValor());
        primeiro.incrementar();
        primeiro.incrementar();
        primeiro.incrementar();
        IO.println(primeiro.obterValor());
        primeiro.atribuirValor(0);
        IO.println(primeiro.obterValor());
    }
}
