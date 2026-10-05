package engtelecom.poo;

public class Robo {

    // atributos

    private Bateria bateria;
    private Coordenada localAtual;
    private Coordenada tamMapa;

    // métodos publicos


    public Robo(int largura, int altura, int x, int y) {
        this.bateria = new Bateria();
        this.localAtual = new Coordenada(x, y);
        this.tamMapa = new Coordenada(largura, altura);
    }

    public Coordenada deslocar(int unidades, String direcao){
        if(unidades <= bateria.valor){
            switch (direcao){
                case "N" -> {
                    if (this.tamMapa.y >= (this.localAtual.y + unidades)) {
                        this.localAtual.y += unidades;
                        bateria.valor -= unidades;
                    } else {
                        bateria.valor -= bateria.consumo(unidades, this.tamMapa.y, this.localAtual.y);
                        this.localAtual.y = this.tamMapa.y;
                    }
                }
                case "S" -> {
                    if ((this.localAtual.y - unidades) >= 0) {
                        this.localAtual.y -= unidades;
                        bateria.valor -= unidades;
                    } else {
                        bateria.valor -= bateria.consumo(unidades, this.tamMapa.y, this.localAtual.y);
                        this.localAtual.y = 0;
                    }
                }
                case "L" -> {
                    if (this.tamMapa.x >= (this.localAtual.x + unidades)) {
                        this.localAtual.x += unidades;
                        bateria.valor -= unidades;
                    } else {
                        bateria.valor -= bateria.consumo(unidades, this.tamMapa.x, this.localAtual.x);
                        this.localAtual.x = this.tamMapa.x;
                    }
                }
                case "O" -> {
                    if ((this.localAtual.x - unidades) >= 0) {
                        this.localAtual.x -= unidades;
                        bateria.valor -= unidades;
                    } else {
                        bateria.valor -= bateria.consumo(unidades, this.tamMapa.x, this.localAtual.x);
                        this.localAtual.x = 0;
                    }
                }
                default -> {return this.localAtual;}
            }
        }
        return localAtual;
    }

    public void carregarBateria(){
        bateria.carregar();
    }

    // adicionar metodo para carregar a bateria
    // caso tiver carregado duas vezes, o total da bateria subtrai em um
    // caso ja estiver em 100, fica em 100
    // talvez criar nova classe para bateria

    @Override
    public String toString() {
        return "Robo{" + bateria +
                ", localAtual =" + localAtual + "}";
    }
}
