import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

//        EJEMPLOS LISTAS Y SETS


//        ArrayList<Empleado> empleados;
//        empleados = new ArrayList<Empleado>();
//
//        empleados.add(new Empleado("Iker"));
//        Empleado e1 = empleados.get(2);
//        empleados.remove(2);

//        ----------------------------------------------------------------

//        Personaje p1 = new Personaje();
//        Personaje p2 = new Personaje();
//
//        HashMap<String, Personaje> personajes
//                = new HashMap<String, Personaje>();
//
//        personajes.put("p1", p1); Asignar una clave a un valor
//        personajes.put("p2", p2);
//
//        personajes.get("p1").mostrarEstado();

//        Set<String> todasClaves = personajes.keySet();
//
//        for (String clave: todasClaves) {
//            Personaje p = personajes.get(clave);
//        }


//        Ejercicio 1:
//        Crea un programa que:
//        - Lea por teclado 3 palabras (un bucle...).
//        - Las guarde en una estructura de datos SIN duplicados
//        - Imprima todas las palabras en dicha estructura

        Scanner escaner = new Scanner(System.in);

        HashSet<String> palabras = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce una palabra: ");
            String palabraTeclado = escaner.nextLine();
            palabras.add(palabraTeclado);
        }

        Iterator<String> imprimir = palabras.iterator();
        while (imprimir.hasNext()) {
            System.out.print("\n" + imprimir.next());
        }
    }
}