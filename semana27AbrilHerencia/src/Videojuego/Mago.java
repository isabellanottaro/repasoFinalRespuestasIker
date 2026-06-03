package Videojuego;

public class Mago extends  Personaje {

    public Mago(String nombre, int ataque) {
        super(nombre, ataque);
    }

    @Override
    public int atacar() {
        int variacion = (int) (ataque * 0.2);
        int ataqueMinimo = ataque - variacion;
        int ataqueMaximo = ataque + variacion + 1;
        return random.nextInt(ataqueMinimo, ataqueMaximo);
    }
}
