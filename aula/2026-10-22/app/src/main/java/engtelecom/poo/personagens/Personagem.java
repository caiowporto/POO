package engtelecom.poo.personagens;

public class Personagem {

    // atributos

    protected int vida;
    protected int ataque;
    protected double velocidade;

    // métodos


    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover(){return "";}

    public String atacar(){
        return "";
    }
}
