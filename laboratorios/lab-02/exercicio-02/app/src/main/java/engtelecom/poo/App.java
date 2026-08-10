package engtelecom.poo;

import java.util.Locale;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        int numeroGerado = r.nextInt(1,101);
        int numeroTentado;
        do{
            numeroTentado = Integer.parseInt(IO.readln("Tente acertar o numero gerado: "));
            if (numeroGerado < numeroTentado) IO.println("O numero gerado é menor!");
            if (numeroGerado > numeroTentado) IO.println("O numero gerado é maior!");
        } while (numeroGerado != numeroTentado);

        IO.println("Parabéns, Você acertou!");

    }
}

