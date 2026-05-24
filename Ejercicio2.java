import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, clave;

        System.out.print("Ingrese usuario: ");
        usuario = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        clave = sc.nextLine();

        if (usuario.equals("admin") && clave.equals("1234")) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}