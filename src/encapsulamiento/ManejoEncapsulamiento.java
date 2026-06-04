package encapsulamiento;

public class ManejoEncapsulamiento {
    public static void main(String[] args) {
        Producto producto = new Producto("Cuaderno universitario", 18.50, 4);

        producto.mostrarProducto();

        System.out.println();

        producto.setNombre("Lapicero azul");
        producto.setPrecio(3.75);
        producto.setCantidad(10);

        producto.mostrarProducto();
    }
}