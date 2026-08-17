package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Carro fusca = new Carro();
        Carro ferrari = new Carro();

        fusca.definirCor("Vermelho");

        IO.println(fusca.obterCor());

        IO.println(fusca.obterVelocidadeAtual());
        fusca.acelerar(50);
        IO.println(fusca.obterVelocidadeAtual());
        fusca.frear(10);
        IO.println(fusca.obterVelocidadeAtual());

    }
}
