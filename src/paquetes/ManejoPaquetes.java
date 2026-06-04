package paquetes;

public class ManejoPaquetes {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();

        utilidades.mostrarSeparador();
        utilidades.mostrarMensaje("Práctica de organización por paquetes en Java");

        int resultado = utilidades.multiplicar(8, 5);

        System.out.println("Resultado de la multiplicación: " + resultado);
        utilidades.mostrarSeparador();
    }
}