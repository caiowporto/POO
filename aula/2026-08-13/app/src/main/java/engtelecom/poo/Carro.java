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
        int velocidadeFinal = velocidadeAtual + incVelocidade;
        velocidadeAtual = Math.min(velocidadeFinal, 100); // pega o menor valor entre os dois termos
//        if (incVelocidade > 0){
//            velocidadeAtual = ((velocidadeAtual + incVelocidade) < 100) ? velocidadeAtual + incVelocidade : 100;
//        } (? é então e : é senão.)
    }

    public void frear(int decVelocidade){
        int velocidadeFinal = velocidadeAtual - decVelocidade;
        velocidadeAtual = Math.max(velocidadeFinal, 0); // pega o maior valor ente os dois termos
//        if (decVelocidade > 0){
//            velocidadeAtual = ((velocidadeAtual - decVelocidade) < 0) ? velocidadeAtual - decVelocidade : 0;
//        } (? é então e : é senão.)
    }


}
