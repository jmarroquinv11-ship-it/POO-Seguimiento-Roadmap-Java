package initializer;

public class BloqueInicializacion {
    private String nombre;
    private int codigo;
    private static int contador;

    static {
        contador = 1000;
        System.out.println("Bloque static ejecutado");
    }

    {
        codigo = contador++;
        System.out.println("Bloque de instancia ejecutado");
    }

    public BloqueInicializacion(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
    }
}