import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";

        int intentos = 0;

        while(intentos < 3) {

            System.out.print("Usuario: ");
            String usuario = sc.next();

            System.out.print("Contraseña: ");
            String clave = sc.next();

            if(usuario.equals(usuarioCorrecto) &&
               clave.equals(claveCorrecta)) {

                System.out.println("Acceso permitido");
                break;

            } else {

                intentos++;
                System.out.println("Datos incorrectos");
            }
        }

        if(intentos == 3) {
            System.out.println("Cuenta bloqueada");
        }

        sc.close();
    }
}