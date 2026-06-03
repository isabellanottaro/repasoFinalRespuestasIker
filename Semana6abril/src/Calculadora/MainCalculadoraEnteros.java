package Calculadora;

public class MainCalculadoraEnteros {
    public static void main(String[] args) {

        System.out.println("\n--- Pruebas Calculadora Enteros ---");
        System.out.println("El resultado de la suma es: " + CalculadoraEnteros.sumar(5, 4));
        System.out.println("El resultado de la resta es: " + CalculadoraEnteros.restar(10, 2));
        System.out.println("El resultado de la multiplicación es: " + CalculadoraEnteros.multiplicar(8, 7));
        System.out.println("El resultado de la división es: " + CalculadoraEnteros.dividir(6, 2));
        System.out.println("El resultado de la división es: " + CalculadoraEnteros.dividir(6, 0));

    }
}
