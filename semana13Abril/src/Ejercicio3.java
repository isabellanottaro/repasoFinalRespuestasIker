import java.util.HashMap;
import java.util.Set;

public class Ejercicio3 {
    public static void main(String[] args) {

//        Ejercicio 3:
//        Crea un programa que almacene una variable inventario que contenga
//        para cada tipo de item el número que poseemos.
//
//                - Añade 2 "anillo"
//                - Añade 1 "pulsera"
//                - Añade 3 "piercing"
//                - Añade 1 "anillo" más.
//                - Muestra la cantidad de cada uno que hay almacenada.

//        - Elimina la pulsera (que no aparezca).
//        - Comprueba que la pulsera ya no existe.
//
//        Debe permitir:
//        - añadir objetos
//        - incrementar cantidad si ya existe
//        - mostrar todos los objetos con su cantidad
//
//        En el mismo main, añade 2 objetos, muéstralos

        HashMap<String, Integer> inventario = new HashMap<>();

        inventario.put("Anillo", 2);
        inventario.put("Pulsera", 1);
        inventario.put("Piercing", 3);
        int anillos = inventario.get("Anillo");
        anillos = anillos + 1;
        inventario.put("Anillo", anillos);

        inventario.remove("Pulsera");

        Set<String> todasClaves = inventario.keySet();
        for (String clave: todasClaves) {
            int cantidad = inventario.get(clave);
            System.out.print("\nEl item " + clave + " tiene " + cantidad + " cantidades");
        }
    }
}
