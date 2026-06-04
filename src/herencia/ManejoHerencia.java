package herencia;

public class ManejoHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Carlos López", 20, "2026001", "Ingeniería en Sistemas");
        Profesor profesor = new Profesor("Ana Martínez", 35, "Programación Orientada a Objetos", 5200);

        System.out.println("Datos del alumno:");
        alumno.mostrarDatosAlumno();
        alumno.saludar();
        alumno.estudiar();

        System.out.println();

        System.out.println("Datos del profesor:");
        profesor.mostrarDatosProfesor();
        profesor.saludar();
        profesor.impartirClase();
    }
}