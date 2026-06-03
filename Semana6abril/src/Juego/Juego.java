package Juego;

public class Juego {

    private String nombre;
    private static final int MAX_JUGADORES = 4;
    private int jugadoresActuales;

    public Juego(String nombre, int jugadoresActuales) {
        this.nombre = nombre;
        this.jugadoresActuales = jugadoresActuales;
    }

    public boolean unirJugador() {
        if (jugadoresActuales < MAX_JUGADORES) {
            jugadoresActuales++;
            System.out.println("Jugador añadido correctamente. En el " + nombre + " hay " + jugadoresActuales + " jugadores");
            return true;
        }
        System.out.println("Error al añadir al jugador, máximo alcanzado!!");
        return false;
    }
}
