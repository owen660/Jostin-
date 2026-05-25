import java.util.Scanner;

public class Becas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Ingresos familiares bajos (true/false): ");
        boolean bajos = sc.nextBoolean();

        System.out.print("Cursos desaprobados: ");
        int cursos = sc.nextInt();

        if(promedio >= 16 && bajos && cursos <= 1) {
            System.out.println("Beca completa");
        }
        else if((promedio >= 14 && bajos) || cursos == 0) {
            System.out.println("Beca parcial");
        }
        else {
            System.out.println("No recibe beca");
        }

        sc.close();
    }
}