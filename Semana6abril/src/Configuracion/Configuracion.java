package Configuracion;

public class Configuracion {

    private static String idioma = "ES";

    public static String getIdioma() {
        return idioma;
    }

    public static void setIdioma(String idioma) {
        Configuracion.idioma = idioma;
    }
}
