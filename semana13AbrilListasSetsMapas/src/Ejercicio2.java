import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {
    public static void main(String[] args) {


//        Ejercicio 2:
//        Crea una lista de números enteros. Recuerda que las listas son de Objetos, no de tipos Básicos;
//        Java implementa el objeto Integer para los enteros, Double para los double, Float para los float,
//        Boolean para los boolean...
//                - añade varios números
//                - muestra todos los números
//                - muestra cuantos números hay en total
//                - calcula la suma total
//                - calcula el número mayor

        ArrayList<Integer> listaEnteros;
        listaEnteros = new ArrayList<>();

        listaEnteros.add(10);
        listaEnteros.add(3);
        listaEnteros.add(154);
        listaEnteros.add(72);
        listaEnteros.add(21);

        Iterator<Integer> imprimir = listaEnteros.iterator();
        while (imprimir.hasNext()) {
            System.out.println(imprimir.next());
        }

        int total = listaEnteros.size();
        System.out.println("\nEn total hay " + total + " números");

        int sumaTotal = 0;
        for (int numero: listaEnteros) {
            sumaTotal = sumaTotal + numero;
        }
        System.out.println("La suma total es " + sumaTotal);

        int mayor = listaEnteros.get(0);
        int menor = listaEnteros.get(0);
        for (int numero: listaEnteros) {
            if (numero > mayor) {
                mayor = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
    }
}
