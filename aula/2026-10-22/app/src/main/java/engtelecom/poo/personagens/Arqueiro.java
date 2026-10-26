package engtelecom.poo.personagens;

public class Arqueiro extends Personagem {

    public Arqueiro(){
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return "Arqueiro se move com velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Arqueiro ataca com força: " + this.ataque;
    }
}
