void main(){

    String sigla = IO.readln("Entre com a sigla da disciplina: ");
    String[] dias = new String[5];
    String aulas;
    int indice = 0;

    do {
        aulas = IO.readln("Entre com o dia da semana que voce tem aula: ");
        switch(aulas.toLowerCase()){
            case "seg", "ter", "qua", "qui", "sex" : {
                dias[indice] = aulas;
                indice++;
                break;
            }
            default: 
                IO.println("Valor Invalido. Dias permitidos: seg, ter, qua, qui ou sex.");
                break;
        }
    } while (!aulas.equals("nao"));

    String texto = String.format("Na disciplina de %s você tem aulas nos seguintes dias: ", sigla);
    IO.println(texto);

    for (int i = 0; i < indice; i++){
        String mensagem = String.format("- %s", dias[i]);
        IO.println(mensagem);
        
    }

}