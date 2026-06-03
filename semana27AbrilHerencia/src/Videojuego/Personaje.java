package Videojuego;

import java.util.Random;

public class Personaje {

    protected String nombre;
    protected int ataque;

    protected static final Random random = new Random();

    public Personaje(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public int atacar() {
        return ataque;
    }

    public String getNombre() {
        return nombre;
    }
}
