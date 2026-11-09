package engtelecom.poo;

public abstract class Veiculo {

    private int id;
    private int velAtual;
    private final int VELMAXIMA = 200;

    public Veiculo(int id) {
        this.id = id;
        this.velAtual = 0;
    }

    public void acelerar(int valor){
        if ((velAtual + valor) < VELMAXIMA){
            velAtual += valor;
        } else{
            velAtual = VELMAXIMA;
        }
    }
    public void frear(int valor){
        if ((velAtual - valor) < 0){
            velAtual = 0;
        } else{
            velAtual -= valor;
        }
    }
}
