import java.util.Scanner;

public class LogicaOK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== OPERACIONES LÓGICAS ===");
        System.out.println("Escribe: AND, OR o XOR");

        System.out.print("Operador: ");
        String op = sc.next().toUpperCase();

        System.out.print("Primer valor (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Segundo valor (true/false): ");
        boolean b = sc.nextBoolean();

        switch (op) {
            case "AND":
                System.out.println("Resultado: " + (a && b));
                break;

            case "OR":
                System.out.println("Resultado: " + (a || b));
                break;

            case "XOR":
                System.out.println("Resultado: " + (a ^ b));
                break;

            default:
                System.out.println("Operador inválido");
        }

        sc.close();
    }
}