package Empleado;

public class Empleado {

    private String nombre;
    private final int ID;
    private static int totalEmpleados = 0;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.ID = totalEmpleados + 1;
        this.totalEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
}
