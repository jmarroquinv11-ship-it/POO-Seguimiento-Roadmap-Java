package enums;

public class UsodeEnums {
    public static void main(String[] args) {
        DiaSemana diaActual = DiaSemana.MIERCOLES;

        System.out.println("Día seleccionado: " + diaActual);

        if (diaActual == DiaSemana.SABADO || diaActual == DiaSemana.DOMINGO) {
            System.out.println("Es fin de semana.");
        } else {
            System.out.println("Es día de estudio.");
        }

        System.out.println();

        System.out.println("Lista de días de la semana:");

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}