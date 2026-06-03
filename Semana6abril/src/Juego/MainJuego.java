package Juego;

public class MainJuego {
    public static void main(String[] args) {

        Juego juego1 = new Juego("Parchís", 2);
        System.out.println("\n---PRUEBAS PARCHÍS---");
        juego1.unirJugador();
        juego1.unirJugador();
        juego1.unirJugador();

        Juego juego2 = new Juego("Catán", 1);
        System.out.println("\n---PRUEBAS CATÁN---");
        for (int i = 0; i < 4; i++) {
            juego2.unirJugador();
        }
    }
}
