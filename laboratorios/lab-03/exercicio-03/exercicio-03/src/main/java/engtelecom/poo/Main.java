package engtelecom.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main() {
        Retangulo r1 = new Retangulo(5,8, "ASCII");
        Retangulo r2 = new Retangulo();

        IO.println(r1.area());
        IO.println(r2.area());
        IO.println(r1.perimetro());
        IO.println(r2.perimetro());
        IO.println(r1.toString());
        IO.println(r2.toString());
    }
}
