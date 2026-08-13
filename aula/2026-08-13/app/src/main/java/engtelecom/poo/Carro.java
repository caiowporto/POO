package engtelecom.poo;

public class Carro {

    // atributos

    private String cor; // null
    private int velocidadeAtual;

    // métodos

    public void definirCor(String novaCor){
        cor = novaCor;
    }

    public String obterCor(){
        return cor;
    }

    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }

    public int acelerar(int incVelocidade){
        int velocidadeFinal = velocidadeAtual + incVelocidade;
        if (velocidadeFinal > 100) {
            return 100;
        } else{
            return velocidadeFinal;
        }
    }

    public int frear(int decVelocidade){
        int velocidadeFinal = velocidadeAtual - decVelocidade;
        if (velocidadeFinal < 0) {
            return 0;
        } else{
            return velocidadeFinal;
        }
    }


}
