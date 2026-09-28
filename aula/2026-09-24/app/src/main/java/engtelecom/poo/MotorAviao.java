package engtelecom.poo;

public class MotorAviao {

    // atributos

    private String tipo;
    private boolean ligado;

    // métodos públicos


    public MotorAviao(String tipoMotor) {
        this.tipo = tipoMotor;
        ligado = false;
    }

    public void onOff(){
        ligado = !ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public String toString() {
        return "\n" + "Tipo = " + tipo + ", Ligado? = " + ligado;
    }
}
