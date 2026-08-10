package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        if (args.length > 1) {
            int tamanho = Integer.parseInt(args[1]);
            if ("triangulo".equals(args[0])) {
                for (int i = 1; i <= tamanho; i++) {
                    for (int j = 0; j < i; j++){
                        IO.print("*");
                    }
                    IO.println();
                }
            }
        }
    }
}