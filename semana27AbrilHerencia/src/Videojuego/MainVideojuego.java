package Videojuego;

public class MainVideojuego {
    public static void main(String[] args) {

        Personaje personaje1 = new Personaje("Colt", 100);
        Guerrero guerrero1 = new Guerrero("Leon", 100);
        Mago mago1 = new Mago("Shelly", 100);

        System.out.println("\n---PRUEBAS ATAQUE PERSONAJE---");
        for (int i = 0; i < 10; i++) {
            System.out.println(personaje1.getNombre() + " ha hecho " + personaje1.atacar() + " puntos de daño");
        }

        System.out.println("\n---PRUEBAS ATAQUE GUERRERO---");
        for (int i = 0; i < 10; i++) {
            System.out.println(guerrero1.getNombre() + " ha hecho " + guerrero1.atacar() + " puntos de daño");
        }

        System.out.println("\n---PRUEBAS ATAQUE MAGO---");
        for (int i = 0; i < 10; i++) {
            System.out.println(mago1.getNombre() + " ha hecho " + mago1.atacar() + " puntos de daño");
        }
    }
}
