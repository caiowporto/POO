package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {

    // atributos

    private int maxTripulantes;
    private int maxPassageiros;
    private int capMaxCombustivel;
    private boolean ligado;
    private ArrayList<MotorAviao> motor;

    // métodos públicos

    public Aviao(int maxTripulantes, int maxPassageiros, int capMaxCombustivel, int quantMotores, String tipoMotor) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.capMaxCombustivel = capMaxCombustivel;
        this.motor = new ArrayList<>();

        for (int i = 0; i < quantMotores; i++) {
            this.motor.add(new MotorAviao(tipoMotor));
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void onOff(){
        ligado = !ligado;
        motor.forEach(m -> m.setLigado(ligado));
    }

    public void onOffMotor(int m){
        this.motor.get(m).onOff();
    }

    @Override
    public String toString() {
        return  "Aviao: " + "\n" +
                "Maximo de Tripulantes = " + maxTripulantes + "\n" +
                "Maximo de Passageiros = " + maxPassageiros + "\n" +
                "Capacidade Maxima de Combustivel = " + capMaxCombustivel + "\n" +
                "Ligado? = " + ligado + "\n" +
                "Motor = " + motor;
    }
}
