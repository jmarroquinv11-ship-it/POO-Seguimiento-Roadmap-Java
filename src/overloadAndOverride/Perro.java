package overloadAndOverride;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: guau guau.");
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
    }
}