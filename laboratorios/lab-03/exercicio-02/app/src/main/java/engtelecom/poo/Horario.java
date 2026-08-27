package engtelecom.poo;

public class Horario {

    // atributos

    private int hora;
    private int minuto;
    private int segundo;

    // metodos privados

    private int verificador(int valor, int maximo){
        if (valor >= 0 && valor <= maximo){
            return valor;
        }
        return -1;
    }

    public String retornaExtenso(int valor){
        int d = (valor > 10) ? valor / 10 : valor;
        int u = valor % 10;
        String palavra;

        String dezena = switch(d){
            case 1 -> {
                switch(u){
                    case 0 -> palavra = "Dez";
                    case 1 -> palavra = "Onze";
                    case 2 -> palavra = "Doze";
                    case 3 -> palavra = "Treze";
                    case 4 -> palavra = "Quatorze";
                    case 5 -> palavra = "Quinze";
                    case 6 -> palavra = "dezesseis";
                    case 7 -> palavra = "dezessete";
                    case 8 -> palavra = "dezoito";
                    case 9 -> palavra = "dezenove";
                }
            }
            case 2 -> {
                String g = switch(u){
                    case 1 -> "Um";
                    case 2 -> "Dois";
                    case 3 -> "Tres";
                    case 4 -> "Quatro";
                    case 5 -> "Cinco";
                    case 6 -> "Seis";
                    case 7 -> "Sete";
                    case 8 -> "Oito";
                    case 9 -> "Nove";
                    default -> "";
                };
                palavra = "Vinte e" + g;
            }
            default -> "";
        };
        return palavra;
    }

    // métodos publicos

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Horario(int hora){
        this(hora, 0, 0);
    }

    public Horario(int hora, int minuto){
        this(hora, minuto, 0);
    }

    public boolean setHora(int hora) {
        if (verificador(hora, 24) == -1){
            return false;
        }
        this.hora = hora;
        return true;
    }

    public boolean setMinuto(int minuto) {
        if (verificador(minuto, 60) == -1){
            return false;
        }
        this.minuto = minuto;
        return true;
    }

    public boolean setSegundo(int segundo) {
        if (verificador(segundo, 60) == -1){
            return false;
        }
        this.segundo = segundo;
        return true;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public String extenso(){
        return "a";
    }
}
