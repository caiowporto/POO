package engtelecom.poo;

public class App {

    static void main(String[] args) {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mes: ");


        switch (mes.toLowerCase()){
            case "janeiro", "fevereiro" -> IO.println("Verao");
            case "março" -> {
                if(dia >= 20) IO.println("outono");
                else IO.println("Verao");
            }
            case "abril", "maio" -> IO.println("Outono");
            case "junho" -> {
                if (dia >= 21) IO.println("Inverno");
                else IO.println("Outono");
            }
            case "julho", "agosto" -> IO.println("Inverno");
            case "setembro" -> {
                if (dia >= 22) IO.println("Primavera");
                else IO.println("Inverno");
            }
            case "outubro", "novembro" -> IO.println("Primavera");
            case "dezembro" -> {
                if (dia >= 21) IO.println("Verao");
                else IO.println("Primavera");
            }
            default -> IO.println("Mes invalido!");
        }
    }
}
