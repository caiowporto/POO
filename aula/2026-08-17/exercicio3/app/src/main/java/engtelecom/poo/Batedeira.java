package engtelecom.poo;

public class Batedeira {

    // atributos

    private String estadoAtual = "Desligada.";
    private String ponteira;
    private int cronometro;

    // métodos

    public String obterEstadoAtual(){
        return estadoAtual;
    }

    public void definirCronometro(int tempo){
        cronometro = tempo;
    }

    public int obterTempoAtual(){
        return cronometro;
    }

    public void ligar(){
        estadoAtual = "Ligada.";
    }
    public void bater(){
        estadoAtual = "Trabalhando...";
    }
    public void trocarPonteira(){
        estadoAtual= "Disponível para manutenção.";
    }

    public void escolherPonteira(String tipo){
        ponteira = tipo;
    }

    public String obterPonteiraAtual(){
        return ponteira;
    }
}
