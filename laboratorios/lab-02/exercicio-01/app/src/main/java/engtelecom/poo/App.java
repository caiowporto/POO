package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mes: ");


        switch (mes){
            case "Janeiro", "Fevereiro" -> IO.println("Verao");
            case "Março" -> {
                if(dia >= 20) IO.println("Outono");
                else IO.println("Verao");
            }
            case "Abril", "Maio" -> IO.println("Outono");
            case "Junho" -> {
                if (dia >= 21) IO.println("Inverno");
                else IO.println("Outono");
            }
            case "Julho", "Agosto" -> IO.println("Inverno");
            case "Setembro" -> {
                if (dia >= 22) IO.println("Primavera");
                else IO.println("Inverno");
            }
            case "Outubro", "Novembro" -> IO.println("Primavera");
            case "Dezembro" -> {
                if (dia >= 21) IO.println("Verao");
                else IO.println("Primavera");
            }
            default -> IO.println("Mes invalido!");
        }
    }
}
