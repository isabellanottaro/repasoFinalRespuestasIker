package Circulo;

public class Circulo {

    private double radio;

    public Circulo() {
        this.radio = 5;
    }

    public double areaCirculo() {
        return Constantes.PI * (radio * radio);
    }
}
