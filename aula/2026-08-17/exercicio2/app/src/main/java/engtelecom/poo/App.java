package engtelecom.poo;

public class App {
    public static void main(String[] args){

        Personagem fulano = new Personagem();

        String nome = IO.readln("Escolha o nome do seu personagem: ");
        fulano.definirNome(nome);

        String roupa = IO.readln("Escolha o traje do seu personagem (Casual, Guerreiro ou Futurista): ");
        fulano.definirRoupa(roupa);
        IO.println(fulano.obterRoupaAtual());

        IO.println(fulano.obterVidaAtual());
        fulano.curar(20);
        IO.println(fulano.obterVidaAtual());
    }
}
