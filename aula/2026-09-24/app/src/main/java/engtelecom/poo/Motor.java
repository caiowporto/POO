package engtelecom.poo;

public class Motor {

    // atributos

    private int hp;
    private int giroAtual;
    private int cilindros;

    // métodos públicos


    public Motor() {
        hp = 100;
        giroAtual = 0;
        cilindros = 8;
    }

    public Motor(int hp, int giroAtual, int cilindros) {
        this.hp = hp;
        this.giroAtual = giroAtual;
        this.cilindros = cilindros;
    }

    public Motor(int cilindros, int hp) {
        this.cilindros = cilindros;
        this.hp = hp;
        giroAtual = 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public void acelerar(int v){
        this.giroAtual += v;
    }
}
