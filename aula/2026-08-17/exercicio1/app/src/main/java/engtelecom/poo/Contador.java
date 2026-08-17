package engtelecom.poo;

public class Contador {

    // atributos

    private int valorAtual;

    // métodos

    public void atribuirValor(int valor){
        if(valor >= 0){
            valorAtual = valor;
        }
    }

    public void incrementar(){
        valorAtual += 1;
    }

    public int obterValor(){
        return valorAtual;
    }
}
