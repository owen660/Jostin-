import java.util.Scanner;

public class PasswordSegura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese contraseña: ");
        String pass = sc.nextLine();

        boolean mayuscula = false;
        boolean numero = false;
        boolean simbolo = false;

        for(int i = 0; i < pass.length(); i++) {

            char c = pass.charAt(i);

            if(Character.isUpperCase(c)) {
                mayuscula = true;
            }

            if(Character.isDigit(c)) {
                numero = true;
            }

            if(!Character.isLetterOrDigit(c)) {
                simbolo = true;
            }
        }

        if(pass.length() < 8) {
            System.out.println("Falta longitud mínima");
        }

        if(!mayuscula) {
            System.out.println("Falta mayúscula");
        }

        if(!numero) {
            System.out.println("Falta número");
        }

        if(!simbolo) {
            System.out.println("Falta símbolo");
        }

        if(pass.length() >= 8 &&
           mayuscula &&
           numero &&
           simbolo) {

            System.out.println("Contraseña segura");
        }

        sc.close();
    }
}