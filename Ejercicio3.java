import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monto, descuento = 0;
        String cliente;

        System.out.print("Ingrese monto de compra: ");
        monto = sc.nextDouble();
        sc.nextLine();

        System.out.print("Tipo de cliente (VIP/Normal): ");
        cliente = sc.nextLine();

        if (monto > 500 && cliente.equalsIgnoreCase("vip")) {
            descuento = monto * 0.20;
        } else if (monto > 500) {
            descuento = monto * 0.10;
        }

        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + (monto - descuento));
    }
}