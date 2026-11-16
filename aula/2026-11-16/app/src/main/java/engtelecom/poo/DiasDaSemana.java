package engtelecom.poo;

public enum DiasDaSemana {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda-feira"),
    TERCA(3, "terca-feira" ),
    QUARTA(4, "quarta-feira"),
    QUINTA(5, "quinta-feira"),
    SEXTA(6, "sexta-feira"),
    SABADO(7, "sabado");

    public final int codigo;
    public final String extenso;

    DiasDaSemana(int codigo, String extenso){
        this.codigo = codigo;
        this.extenso = extenso;
    }
}
