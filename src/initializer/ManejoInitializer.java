package initializer;

public class ManejoInitializer {
    public static void main(String[] args) {
        BloqueInicializacion objetoUno = new BloqueInicializacion("Primer objeto");
        objetoUno.mostrarDatos();

        System.out.println();

        BloqueInicializacion objetoDos = new BloqueInicializacion("Segundo objeto");
        objetoDos.mostrarDatos();
    }
}