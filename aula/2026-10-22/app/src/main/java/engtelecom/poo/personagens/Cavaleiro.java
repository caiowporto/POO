package engtelecom.poo.personagens;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String mover() {
        return "Cavaleiro se move com velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Cavaleiro ataca com força: " + this.ataque;
    }
}
