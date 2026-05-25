import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        int a = sc.nextInt();

        System.out.print("Lado 2: ");
        int b = sc.nextInt();

        System.out.print("Lado 3: ");
        int c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a) {

            if(a == b && b == c) {
                System.out.println("Equilátero");
            }
            else if(a == b || a == c || b == c) {
                System.out.println("Isósceles");
            }
            else {
                System.out.println("Escaleno");
            }

        } else {
            System.out.println("No forma un triángulo");
        }

        sc.close();
    }
}