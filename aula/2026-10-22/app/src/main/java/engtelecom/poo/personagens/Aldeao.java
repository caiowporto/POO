package engtelecom.poo.personagens;

public class Aldeao extends Personagem{
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "Aldeao se move com velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Aldeao ataca com força: " + this.ataque;
    }
}
