package basicsOfopp;

public class Carro {
    String marca;
    String modelo;
    int anio;
    double precio;

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: Q" + precio);
    }

    public void encender() {
        System.out.println("El carro " + marca + " " + modelo + " está encendido.");
    }

    public void apagar() {
        System.out.println("El carro " + marca + " " + modelo + " está apagado.");
    }
}