package engtelecom.poo;

public class Pessoa {
    // requisitos: cadastrar pessoas em sistema: nome, email e um id unico.

    // atributos

    private String nome;
    private String email;
    private final int id;
    private static int CONTADOR = 0;

    // métodos


    public Pessoa(String email, String nome) {
        this.email = email;
        this.nome = nome;
        this.id = ++CONTADOR;
    }

    public int getId() {
        return id;
    }

//    @Override
//    public String toString() {
//        return "Pessoa{" +
//                "nome='" + nome + '\'' +
//                ", email='" + email + '\'' +
//                ", id=" + id +
//                '}';
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append("\nEmail: ").append(email);
        sb.append("\nId: ").append(id);
        return sb.toString();
    }
}
