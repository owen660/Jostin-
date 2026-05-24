import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, promedio;

        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();

        promedio = (n1 + n2 + n3) / 3;
        System.out.println("Promedio: " + promedio);

        if (promedio >= 11) {
            System.out.println("Aprobado");
        } else if (promedio > 8) {
            System.out.println("Recuperación");
        } else {
            System.out.println("Desaprobado");
        }
    }
}