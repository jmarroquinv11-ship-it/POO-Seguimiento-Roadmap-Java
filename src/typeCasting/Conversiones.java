package typeCasting;

public class Conversiones {
    public void convertirEnteroADouble(int numero) {
        double resultado = numero;
        System.out.println("Entero original: " + numero);
        System.out.println("Convertido a double: " + resultado);
    }

    public void convertirDoubleAEntero(double numero) {
        int resultado = (int) numero;
        System.out.println("Double original: " + numero);
        System.out.println("Convertido a entero: " + resultado);
    }

    public void convertirTextoANumero(String texto) {
        int resultado = Integer.parseInt(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Convertido a número: " + resultado);
    }

    public void convertirNumeroATexto(int numero) {
        String resultado = String.valueOf(numero);
        System.out.println("Número original: " + numero);
        System.out.println("Convertido a texto: " + resultado);
    }
}