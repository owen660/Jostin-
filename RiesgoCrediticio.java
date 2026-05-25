import java.util.Scanner;

public class RiesgoCrediticio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingreso mensual: ");
        double ingreso = sc.nextDouble();

        System.out.print("Historial (bueno, regular, malo): ");
        String historial = sc.next().toLowerCase();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if(historial.equals("bueno")) {

            if(ingreso >= 3000 && edad >= 25) {
                System.out.println("Riesgo Bajo");
            } else {
                System.out.println("Riesgo Medio");
            }

        } else if(historial.equals("regular")) {

            System.out.println("Riesgo Medio");

        } else {

            System.out.println("Riesgo Alto");
        }

        sc.close();
    }
}