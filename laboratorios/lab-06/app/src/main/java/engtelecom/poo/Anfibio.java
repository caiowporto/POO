package engtelecom.poo;

public abstract class Anfibio extends Veiculo{

    private int lastroAtual;
    private final int CAPMAXLASTRO = 100;
    private boolean rodasRecolhidas;


    public Anfibio(int id) {
        super(id);
        this.lastroAtual = CAPMAXLASTRO;
        this.rodasRecolhidas = false;
    }


}
