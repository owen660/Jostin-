import java.util.Scanner;

public class EvaluadorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("Positivo");
        }
        else if(num < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Cero");
        }

        if(num % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("Múltiplo de 3 y 5");
        }
        else if(num % 3 == 0) {
            System.out.println("Múltiplo de 3");
        }
        else if(num % 5 == 0) {
            System.out.println("Múltiplo de 5");
        }

        sc.close();
    }
}