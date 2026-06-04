package overloadAndOverride;

public class ManejoOverloadAndOverride {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal genérico");
        Perro perro = new Perro("Max", "Labrador");

        animal.hacerSonido();
        animal.comer();
        animal.comer("frutas");

        System.out.println();

        perro.mostrarDatos();
        perro.hacerSonido();
        perro.comer();
        perro.comer("croquetas");
    }
}