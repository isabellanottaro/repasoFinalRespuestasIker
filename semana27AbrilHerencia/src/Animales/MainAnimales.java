package Animales;

public class MainAnimales {
    public static void main(String[] args) {

        System.out.println("\n---MIS MASCOTAS---");

        Perro perro1 = new Perro("Rudolf", "labrador");
        System.out.println(perro1.hacerSonido());

        Gato gato1 = new Gato("Dobby", "naranja");
        System.out.println(gato1.hacerSonido());
    }
}
