package engtelecom.poo;

public class Retangulo {

    // atributos

    private int altura;
    private int largura;
    private String codificacao;

    // métodos publicos


    public Retangulo(int altura, int largura, String codificacao) {
        if (altura <= 0) {
            this.altura = 3;
        } else {
            this.altura = altura;
        }
        if (largura <= 0) {
            this.largura = 4;
        } else {
            this.largura = largura;
        }
        if (codificacao.equals("ASCII") || codificacao.equals("UTF-8")) {
            this.codificacao = codificacao;
        } else {
            this.codificacao = "ASCII";
        }
    }

    public Retangulo() {
        altura = 3;
        largura = 4;
        codificacao = "ASCII";
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        }
        return false;
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        }
        return false;
    }

    public boolean setCodificacao(String codificacao) {
        if (codificacao.equals("ASCII") || codificacao.equals("UTF-8")) {
            this.codificacao = codificacao;
            return true;
        }
        return false;    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public int area(){
        return altura * largura;
    }

    public int perimetro(){
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1) {
                    if (j == 0 || j == largura - 1) {
                        sb.append('+');
                    } else {
                        sb.append('-');
                    }
                } else {
                    if (j == 0 || j == largura - 1) {
                        sb.append('|');
                    } else {
                        sb.append(' ');
                    }
                }
            }
            if (i < altura - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
