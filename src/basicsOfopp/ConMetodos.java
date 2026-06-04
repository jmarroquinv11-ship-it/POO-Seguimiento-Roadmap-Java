package basicsOfopp;

public class ConMetodos {
    public void saludar(String nombre) {
        System.out.println("Bienvenido al seguimiento del Roadmap de Java, " + nombre);
    }

    public int sumar(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public double calcularPromedio(double notaUno, double notaDos, double notaTres) {
        return (notaUno + notaDos + notaTres) / 3;
    }

    public void mostrarResultado(String estudiante, double promedio) {
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Promedio obtenido: " + promedio);
    }
}