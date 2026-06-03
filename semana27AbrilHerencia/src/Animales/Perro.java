package Animales;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public String hacerSonido() {
        return nombre + " de raza " + raza + " hace GUAU!!";
    }
}
