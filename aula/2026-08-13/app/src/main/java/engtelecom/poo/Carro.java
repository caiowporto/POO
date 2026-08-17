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

    public void acelerar(int incVelocidade){
        int velocidadeFinal = obterVelocidadeAtual() + incVelocidade;
        if (velocidadeFinal > 100) {
            velocidadeAtual = 100;
        } else{
            velocidadeAtual = velocidadeFinal;
        }
    }

    public void frear(int decVelocidade){
        int velocidadeFinal = obterVelocidadeAtual() - decVelocidade;
        if (velocidadeFinal < 0) {
            velocidadeAtual = 0;
        } else{
            velocidadeAtual = velocidadeFinal;
        }
    }


}
