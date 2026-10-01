package engtelecom.poo;

public class Robo {

    // atributos

    private int bateria;
    private Coordenada localAtual;
    private Coordenada tamMapa;

    // métodos privados

    private int consumoBateria(int unidades, int valorFinal, int valorAtual){
        return Math.min(Math.abs(valorFinal - valorAtual), Math.abs(unidades - valorAtual));
    }

    // métodos publicos


    public Robo(int largura, int altura, int x, int y) {
        this.bateria = 100;
        this.localAtual = new Coordenada(x, y);
        this.tamMapa = new Coordenada(largura, altura);
    }

    public Coordenada deslocar(int unidades, String direcao){
        int consumo;
        if(unidades <= bateria){
            switch (direcao){
                case "N" -> {
                    if (this.tamMapa.y >= (this.localAtual.y + unidades)) {
                        this.localAtual.y += unidades;
                        bateria -= unidades;
                    } else {
                        bateria -= consumoBateria(unidades, this.tamMapa.y, this.localAtual.y);
                        this.localAtual.y = this.tamMapa.y;
                    }
                }
                case "S" -> {
                    if ((this.localAtual.y - unidades) >= 0) {
                        this.localAtual.y -= unidades;
                        bateria -= unidades;
                    } else {
                        bateria -= consumoBateria(unidades, this.tamMapa.y, this.localAtual.y);
                        this.localAtual.y = 0;
                    }
                }
                case "L" -> {
                    if (this.tamMapa.x >= (this.localAtual.y + unidades)) {
                        this.localAtual.x += unidades;
                        bateria -= unidades;
                    } else {
                        bateria -= consumoBateria(unidades, this.tamMapa.x, this.localAtual.x);
                        this.localAtual.x = this.tamMapa.x;
                    }
                }
                case "O" -> {
                    if ((this.localAtual.y - unidades) >= 0) {
                        this.localAtual.x -= unidades;
                        bateria -= unidades;
                    } else {
                        bateria -= consumoBateria(unidades, this.tamMapa.x, this.localAtual.x);
                        this.localAtual.x = 0;
                    }
                }
                default -> {return this.localAtual;}
            }
        }
        return localAtual;
    }

    // adicionar metodo para carregar a bateria
    // caso tiver carregado duas vezes, o total da bateria subtrai em um
    // caso ja estiver em 100, fica em 100
    // talvez criar nova classe para bateria

    @Override
    public String toString() {
        return "Robo{" +
                "bateria = " + bateria +
                ", localAtual =" + localAtual + "}";
    }
}
