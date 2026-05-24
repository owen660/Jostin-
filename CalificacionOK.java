import java.util.Scanner;

public class CalificacionOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = Character.toUpperCase(sc.next().charAt(0));

        switch (letra) {
            case 'A': System.out.println("Excelente"); break;
            case 'B': System.out.println("Bueno"); break;
            case 'C': System.out.println("Regular"); break;
            case 'D': System.out.println("Deficiente"); break;
            case 'F': System.out.println("Reprobado"); break;
            default: System.out.println("Inválido");
        }
    }
}