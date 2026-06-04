package modificadores;

public class Usuario {
    public String nombre;
    private String password;
    protected String rol;
    public static int totalUsuarios = 0;

    public Usuario(String nombre, String password, String rol) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        totalUsuarios++;
    }

    public void mostrarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
    }

    private boolean validarPassword(String clave) {
        return password.equals(clave);
    }

    public void iniciarSesion(String clave) {
        if (validarPassword(clave)) {
            System.out.println("Acceso permitido para " + nombre);
        } else {
            System.out.println("Acceso denegado para " + nombre);
        }
    }

    public static void mostrarTotalUsuarios() {
        System.out.println("Total de usuarios registrados: " + totalUsuarios);
    }
}