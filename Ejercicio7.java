import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave;

        System.out.print("Ingrese contraseña numérica: ");
        clave = sc.nextInt();

        if (clave > 1000 && clave < 9999) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }
    }
}