package engtelecom.poo;

public class Personagem {

    // atributos

    private String id;
    private String roupa;
    private int vida = 50;

    // métodos

    public void definirNome(String nome){
        id = nome;
    }

    public void definirRoupa(String tipo){
        roupa = tipo;
    }

    public String obterRoupaAtual(){
        return roupa;
    }

    public int obterVidaAtual(){
        return vida;
    }

    public void curar(int valor){
        vida = Math.min((vida + valor), 100);
    }

}
