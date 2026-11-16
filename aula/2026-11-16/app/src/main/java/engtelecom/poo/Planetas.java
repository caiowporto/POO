package engtelecom.poo;

public enum Planetas {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    public final int posicao;

    Planetas(int posicao) {
        this.posicao = posicao;
    }

    public static Planetas getByCodigo(int a){
        for (Planetas p : Planetas.values()){
            if (a == p.posicao){
                return p;
            }
        }
        throw new IllegalArgumentException("codigo inválido");
    }
}
