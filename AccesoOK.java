import java.util.Scanner;

public class AccesoOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rol = sc.next().toUpperCase();

        switch (rol) {
            case "ADMIN": System.out.println("Acceso total"); break;
            case "USER": System.out.println("Acceso parcial"); break;
            case "GUEST": System.out.println("Solo lectura"); break;
            default: System.out.println("Rol inválido");
        }
    }
}