package typeCasting;

public class ManejoTypeCasting {
    public static void main(String[] args) {
        Conversiones conversiones = new Conversiones();

        conversiones.convertirEnteroADouble(25);

        System.out.println();

        conversiones.convertirDoubleAEntero(89.75);

        System.out.println();

        conversiones.convertirTextoANumero("150");

        System.out.println();

        conversiones.convertirNumeroATexto(2026);
    }
}