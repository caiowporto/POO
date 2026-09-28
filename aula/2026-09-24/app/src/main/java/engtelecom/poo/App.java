
package engtelecom.poo;

import net.datafaker.Faker;

public class App {

    static void main (String[] args){

//        Faker faker = new Faker();
//        String nome = faker.name().fullName();
//        String rua = faker.address().streetName();
//        String cidade = faker.address().cityName();
//        String pais = faker.address().country();
//        String estado = faker.address().state();
//
//        Motor v8 = new Motor(100, 8);
//        Carro gol = new Carro("VW", v8);
//
//        Endereco e = new Endereco(pais, estado, cidade, "bairro", rua, 123, "Arvore grande");
//        Aluno a = new Aluno(nome, 2000, e, "nacionalidade", 123456);
//
//        IO.println(a);

        Aviao a1 = new Aviao(100, 90, 113, 6, "turbina");
        IO.println(a1);
        a1.onOff();
        IO.println(a1);
        a1.onOffMotor(1);
        IO.println(a1);
        a1.onOff();


    }
}
