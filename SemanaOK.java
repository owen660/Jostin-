import java.util.Scanner;

public class SemanaOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes - Laborable"); break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Laborable");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}