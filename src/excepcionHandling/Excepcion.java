package excepcionHandling;

import java.util.Scanner;

public class Excepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numeroUno = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numeroDos = scanner.nextInt();

            int resultado = numeroUno / numeroDos;

            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        } catch (Exception e) {
            System.out.println("Error: debe ingresar valores numéricos válidos.");
        } finally {
            System.out.println("Proceso finalizado.");
            scanner.close();
        }
    }
}