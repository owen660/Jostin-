import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Lado 1: ");
        a = sc.nextDouble();
        System.out.print("Lado 2: ");
        b = sc.nextDouble();
        System.out.print("Lado 3: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forman un triángulo");

            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No forman triángulo");
        }
    }
}