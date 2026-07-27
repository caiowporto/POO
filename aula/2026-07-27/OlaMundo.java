
void saudacao(){
    IO.println("Olá Mundo 2");
}

void saudacaoMelhorada(String mensagem){
    IO.println("Olá " + mensagem);
}
void main(){

    IO.println("Olá Mundo");
    // printf("Olá Mundo\n");

    saudacao();

    saudacaoMelhorada("Caio");

    String nome = IO.readln("Entre com o seu nome: ");

    // TODO: imprimir o olá nome na tela
    saudacaoMelhorada(nome);

}