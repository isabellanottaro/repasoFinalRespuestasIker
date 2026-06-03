package Videojuego;

public class Guerrero extends Personaje{

    public Guerrero(String nombre, int ataque) {
        super(nombre, ataque);
    }

    @Override
    public int atacar() {
        if (random.nextInt(100) < 10) {
            System.out.println(nombre + " ha hecho un ataque CRÍTICO!!");
            return ataque * 2;
        }
        return ataque;
    }
}
