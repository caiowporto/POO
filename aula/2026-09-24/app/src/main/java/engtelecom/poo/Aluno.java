package engtelecom.poo;

public class Aluno {

    // atributos

    private String nome;
    private int anoNascimento;
    private Endereco residencia;
    private String nacionalidade;
    private int matricula;

    // métodos públicos


    public Aluno(String nome, int anoNascimento, Endereco residencia, String nacionalidade, int matricula) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.residencia = residencia;
        this.nacionalidade = nacionalidade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Endereco getResidencia() {
        return residencia;
    }

    public void setResidencia(Endereco residencia) {
        this.residencia = residencia;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: \n" +
                "Nome =" + nome + '\n' +
                "Ano de Nascimento = " + anoNascimento + '\n' +
                "Endereço = " + residencia + '\n' +
                "Nacionalidade = " + nacionalidade + '\n' +
                "Matricula = " + matricula;
    }
}
