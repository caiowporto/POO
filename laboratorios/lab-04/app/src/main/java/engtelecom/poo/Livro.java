package engtelecom.poo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class Livro {

    // atributos

    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // métodos públicos

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String codigoDeBarra(){
        int largura = 105;
        int altura = 5;
        StringBuilder saida = new StringBuilder();

        try{
            EAN13Writer writer = new EAN13Writer();
            BitMatrix matriz = writer.encode(isbn, BarcodeFormat.EAN_13, largura, 1);
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < matriz.getWidth(); j++) {
                    if (matriz.get(j, 0)){ // se bit == 1
                        saida.append("\u2588");
                    } else {
                        saida.append(" ");
                    }
                }
                saida.append("\n");
            }

        } catch (Exception e){}

        return saida.toString();
    }

    @Override
    public String toString() {
        return  "==============================" + '\n' +
                "ISBN   = " + isbn + '\n' +
                "Titulo = " + titulo + '\n' +
                "Autor  = " + autor + '\n' +
                "Ano de Publicacao = " + anoPublicacao + '\n' + codigoDeBarra() +
                "==============================";
    }
}
