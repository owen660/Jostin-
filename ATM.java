import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pinCorrecto = 1234;
        double saldo = 2000;
        int intentos = 0;

        while(intentos < 3) {

            System.out.print("Ingrese PIN: ");
            int pin = sc.nextInt();

            if(pin == pinCorrecto) {

                System.out.println("1. Ver saldo");
                System.out.println("2. Retirar");

                int opcion = sc.nextInt();

                if(opcion == 1) {
                    System.out.println("Saldo: " + saldo);
                }

                else if(opcion == 2) {

                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();

                    if(retiro > 1000) {
                        System.out.println("Supera límite diario");
                    }
                    else if(retiro > saldo) {
                        System.out.println("Fondos insuficientes");
                    }
                    else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso");
                        System.out.println("Saldo restante: " + saldo);
                    }
                }

                break;

            } else {

                intentos++;
                System.out.println("PIN incorrecto");
            }
        }

        if(intentos == 3) {
            System.out.println("Tarjeta bloqueada");
        }

        sc.close();
    }
}