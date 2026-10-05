package engtelecom.poo;

public class Bateria {

    // atributos

    public int valor;
    private int quantRecarga;
    private int recargaMax;

    // métodos


    public Bateria() {
        this.valor = 100;
        this.quantRecarga = 0;
        this.recargaMax = 100;
    }

    public int consumo(int unidades, int valorFinal, int valorAtual){
        return Math.min(Math.abs(valorFinal - valorAtual), Math.abs(unidades - valorAtual));
    }

    public void carregar(){
        if (quantRecarga >= 2) {
            quantRecarga = 0;
            recargaMax--;
        }
        valor = recargaMax;
        quantRecarga++;
    }

    @Override
    public String toString() {
        return "Bateria {" +
                " valor = " + valor +
                ", quantRecarga = " + quantRecarga +
                ", recargaMax = " + recargaMax +
                '}';
    }
}
