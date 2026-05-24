import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        double valor = sc.nextDouble();

        switch (op) {
            case 1: System.out.println(valor / 1000 + " km"); break;
            case 2: System.out.println(valor * 1000 + " m"); break;
            case 3: System.out.println((valor * 9/5) + 32 + " F"); break;
            case 4: System.out.println((valor - 32) * 5/9 + " C"); break;
            default: System.out.println("Opción inválida");
        }
    }
}