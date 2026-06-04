package herencia;

public class Profesor extends Persona {
    private String especialidad;
    private double salario;

    public Profesor(String nombre, int edad, String especialidad, double salario) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public void mostrarDatosProfesor() {
        mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Salario: Q" + salario);
    }

    public void impartirClase() {
        System.out.println(nombre + " está impartiendo la clase de " + especialidad);
    }
}