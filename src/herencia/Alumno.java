package herencia;

public class Alumno extends Persona {
    private String carnet;
    private String carrera;

    public Alumno(String nombre, int edad, String carnet, String carrera) {
        super(nombre, edad);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public void mostrarDatosAlumno() {
        mostrarDatos();
        System.out.println("Carnet: " + carnet);
        System.out.println("Carrera: " + carrera);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando " + carrera);
    }
}