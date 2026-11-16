package engtelecom.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {

    // sigla e os dias da semana que tem aula

    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sigla: ").append(sigla).append("\n");
        sb.append("Dias da Semana: ").append("\n");
        for(DiasDaSemana d : dias){
            sb.append("-").append(d.extenso).append("\n");
        }
        return sb.toString();
    }

    public DiasDaSemana[] getDias() {
        return dias;
    }

    public String getSigla() {
        return sigla;
    }
}

