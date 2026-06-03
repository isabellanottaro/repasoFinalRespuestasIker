package Contador;

public class Contador {

    private static int contador;

    public static int getContador() {
        return contador;
    }

    public static void incrementar() {
        contador += 1;
    }
}
