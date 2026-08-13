package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        if (args.length > 1) {
            switch (args[0]){
                case "triangulo" -> {
                    int tamanho = Integer.parseInt(args[1]);
                    for (int i = 1; i <= tamanho; i++) {
                        for (int j = 0; j < i; j++){
                            IO.print("*");
                        }
                        IO.println();
                    }
                }
                case "retangulo" -> {
                    int largura = Integer.parseInt(args[1]);
                    int tamanho = Integer.parseInt(args[2]);
                    for(int i = 0; i < largura; i++){
                        IO.print("*");
                    }
                    IO.println();
                    for (int j = 1; j < (tamanho-1); j++){
                        for (int k = 1; k <= largura; k++){
                            if(k == 1 || k == largura) {
                                IO.print("*");
                            } else {
                                IO.print(" ");
                            }
                        }
                        IO.println();
                    }
                    for(int i = 0; i < largura; i++){
                        IO.print("*");
                    }
                    IO.println();
                }
                default -> IO.print("Erro.");
            }
        }
    }
}