package engtelecom.poo;

public abstract class Anfibio extends Veiculo{

    private int lastroAtual;
    private final int CAPMAXLASTRO = 100;
    public boolean rodasRecolhidas;


    public Anfibio(int id) {
        super(id);
        this.lastroAtual = CAPMAXLASTRO;
        this.rodasRecolhidas = false;
    }

    public void recolherSoltarRodas(){
        if (!rodasRecolhidas){
            rodasRecolhidas = true;
            esvaziarEncherLastro();
        } else{
            rodasRecolhidas = false;
        }
    }

    public void esvaziarEncherLastro(){
        if (lastroAtual == CAPMAXLASTRO){
            lastroAtual = 0;
        } else if(!rodasRecolhidas){
            lastroAtual = CAPMAXLASTRO;
        }
    }


}
