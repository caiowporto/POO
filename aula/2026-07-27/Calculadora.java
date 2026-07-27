
void main(){

    int a = Integer.parseInt(IO.readln("Entre com um valor: "));
    int b = Integer.parseInt(IO.readln("Entre com outro valor: "));
    int soma = a + b;

    // TODO: exibir na tela o resultado da soma de a e b
    IO.println(soma);

    if (a > b){
        IO.println("O primeiro valor é maior que o segundo.");
    } else {
        IO.println("O segundo valor é maior que o primeiro.");
    }
}