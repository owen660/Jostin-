import java.util.Scanner;

public class CalculadoraOK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");

        System.out.print("Elige una opción: ");
        int op = sc.nextInt();

        System.out.print("Ingrese primer número: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese segundo número: ");
        double b = sc.nextDouble();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + (a + b));
                break;

            case 2:
                System.out.println("Resultado: " + (a - b));
                break;

            case 3:
                System.out.println("Resultado: " + (a * b));
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Error: No se puede dividir entre 0");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;

            case 5:
                System.out.println("Resultado: " + Math.pow(a, b));
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }
}