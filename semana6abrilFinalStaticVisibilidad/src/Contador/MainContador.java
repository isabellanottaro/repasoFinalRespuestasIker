package Contador;

public class MainContador {
    public static void main(String[] args) {

//        FINAL:
//        final int maximo = 10;
//        maximo = 20; Aquí daría error, solo se puede asignar una vez con final


        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        System.out.println("\nEl contador final es de: " + Contador.getContador());
    }
}