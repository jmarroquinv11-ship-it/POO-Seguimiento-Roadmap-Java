package basicsOfopp;

public class Inicio {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.anio = 2020;
        carro.precio = 85000;

        carro.mostrarInformacion();
        carro.encender();
        carro.apagar();

        System.out.println();

        ConMetodos operaciones = new ConMetodos();

        operaciones.saludar("Juan Pablo");

        int suma = operaciones.sumar(15, 25);
        System.out.println("Resultado de la suma: " + suma);

        double promedio = operaciones.calcularPromedio(85, 90, 88);
        operaciones.mostrarResultado("Juan Pablo", promedio);
    }
}