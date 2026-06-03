package Usuario;

public class Usuario {

    private String nombre;
    private static int totalUsuarios;

    public Usuario() {
        this.nombre = "Erik";
        this.totalUsuarios += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getTotalUsuarios() {
        return totalUsuarios;
    }
}
