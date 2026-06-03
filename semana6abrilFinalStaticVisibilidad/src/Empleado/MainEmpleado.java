package Empleado;

public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Iker");
        Empleado empleado2 = new Empleado("Dani");
        Empleado empleado3 = new Empleado("Carlos");
        Empleado empleado4 = new Empleado("Isabella");

        System.out.println("\nEl empleado " + empleado1.getNombre() + " y su ID es " + empleado1.getID());
        System.out.println("El empleado " + empleado2.getNombre() + " y su ID es " + empleado2.getID());
        System.out.println("El empleado " + empleado3.getNombre() + " y su ID es " + empleado3.getID());
        System.out.println("El empleado " + empleado4.getNombre() + " y su ID es " + empleado4.getID());

        System.out.println("\nEl total de empleados es " + Empleado.getTotalEmpleados());
    }
}
