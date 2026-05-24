import java.util.Scanner;

public class EstacionamientoOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        int horas = sc.nextInt();
        double tarifa = 0;

        switch (tipo) {
            case 1: tarifa = 2; break; // moto
            case 2: tarifa = 5; break; // auto
            case 3: tarifa = 10; break; // camión
        }

        System.out.println("Total: " + (tarifa * horas));
    }
}