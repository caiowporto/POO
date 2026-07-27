
void main(){

    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char sexo = IO.readln("Entre com o seu sexo(m/f): ").charAt(0);

    if (idade>=18 && sexo == 'm'){
        IO.println("Você precisa apresentar atestado de reservista!");
    } else {
        IO.println("Você não precisa apresentar atestado de reservista!");
    }
}
