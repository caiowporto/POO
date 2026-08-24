package engtelecom.poo;

public class Carro {

    // atributos

    private String cor; // null
    private int velocidadeAtual;
    private final int VELOCIDADE_MAX = 100;
    private static final int VELOCIDADE_MIN = 0;

    // métodos

    public Carro(String cor) {
        this.cor = cor;
        this.velocidadeAtual = 0;
    }

    public static int getVelocidadeMin(){
        return VELOCIDADE_MIN;
    }

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
        velocidadeAtual = Math.min(velocidadeFinal, VELOCIDADE_MAX); // pega o menor valor entre os dois termos
//        if (incVelocidade > 0){
//            velocidadeAtual = ((velocidadeAtual + incVelocidade) < 100) ? velocidadeAtual + incVelocidade : 100;
//        } (? é então e : é senão.)
    }

    public void frear(int decVelocidade){
        int velocidadeFinal = velocidadeAtual - decVelocidade;
        velocidadeAtual = Math.max(velocidadeFinal, VELOCIDADE_MIN); // pega o maior valor ente os dois termos
//        if (decVelocidade > 0){
//            velocidadeAtual = ((velocidadeAtual - decVelocidade) < 0) ? velocidadeAtual - decVelocidade : 0;
//        } (? é então e : é senão.)
    }


}
