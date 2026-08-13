package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Carro fusca = new Carro();
        Carro ferrari = new Carro();

        fusca.definirCor("Vermelho");

        IO.println(fusca.obterCor());

        fusca.obterVelocidadeAtual();
        IO.println(fusca.acelerar(50));
        IO.println(fusca.frear(10));

    }
}
