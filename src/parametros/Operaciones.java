package parametros;

public class Operaciones {
    public void mostrarNombre(String nombre) {
        System.out.println("Nombre recibido: " + nombre);
    }

    public int sumar(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public double calcularDescuento(double precio, double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public void mostrarCompra(String producto, int cantidad, double precioFinal) {
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio final: Q" + precioFinal);
    }
}