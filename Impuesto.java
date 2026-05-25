import java.util.Scanner;

public class Impuesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese ingreso: ");
        double ingreso = sc.nextDouble();

        double impuesto;

        if(ingreso < 0) {
            System.out.println("Ingreso inválido");
        }
        else if(ingreso <= 1000) {
            impuesto = ingreso * 0.05;
            System.out.println("Impuesto: " + impuesto);
        }
        else if(ingreso <= 5000) {
            impuesto = ingreso * 0.10;
            System.out.println("Impuesto: " + impuesto);
        }
        else {
            impuesto = ingreso * 0.20;
            System.out.println("Impuesto: " + impuesto);
        }

        sc.close();
    }
}