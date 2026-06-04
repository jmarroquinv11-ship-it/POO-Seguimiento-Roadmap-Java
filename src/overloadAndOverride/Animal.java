package overloadAndOverride;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void comer(String alimento) {
        System.out.println(nombre + " está comiendo " + alimento + ".");
    }
}