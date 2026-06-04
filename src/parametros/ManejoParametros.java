package parametros;

public class ManejoParametros {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        operaciones.mostrarNombre("Juan Pablo");

        int resultadoSuma = operaciones.sumar(30, 45);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        double precioConDescuento = operaciones.calcularDescuento(250, 15);
        operaciones.mostrarCompra("Mochila", 1, precioConDescuento);
    }
}