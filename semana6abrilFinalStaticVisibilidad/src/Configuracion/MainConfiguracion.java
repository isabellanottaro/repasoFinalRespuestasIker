package Configuracion;

public class MainConfiguracion {

    private static void saludar(String nombre) {
        if (Configuracion.getIdioma().equals("ES")) {
            System.out.println("\nHola " + nombre);
        } else if (Configuracion.getIdioma().equals("EN")) {
            System.out.println("Hello " + nombre);
        }
    }

    public static void main(String[] args) {

        saludar("Iker");
        Configuracion.setIdioma("EN");
        saludar("Dani");
    }
}
