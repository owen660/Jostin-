import java.util.Scanner;

public class Transporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia en km: ");
        double distancia = sc.nextDouble();

        System.out.print("Tipo usuario (estudiante/adulto/mayor): ");
        String tipo = sc.next().toLowerCase();

        System.out.print("Horario (normal/nocturno): ");
        String horario = sc.next().toLowerCase();

        double costo = distancia * 1.5;

        if(tipo.equals("estudiante")) {
            costo *= 0.7;
        }
        else if(tipo.equals("mayor")) {
            costo *= 0.5;
        }

        if(horario.equals("nocturno")) {
            costo *= 1.2;
        }

        System.out.println("Costo final: S/" + costo);

        sc.close();
    }
}