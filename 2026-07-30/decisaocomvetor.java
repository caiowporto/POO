
void main(){

String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "OUtubro", "Novembro", "Dezembro"};
int mes;

do {
    mes = Integer.parseInt(IO.readln("Entre com um numero inteiro: "));

} while (mes <= 0 || mes >= 13);

IO.println(meses[mes-1]);

for(int i = 0; i < meses.length; i++){
    System.out.println(meses[i]);
}

for(String valor : meses){
    System.out.println(valor);
}
}