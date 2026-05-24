import java.util.Scanner;

public class RestauranteOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                switch (sc.nextInt()) {
                    case 1: System.out.println("Panqueques - $5"); break;
                    case 2: System.out.println("Café - $2"); break;
                }
                break;
            case 2:
                switch (sc.nextInt()) {
                    case 1: System.out.println("Pollo - $10"); break;
                    case 2: System.out.println("Arroz - $6"); break;
                }
                break;
            case 3:
                switch (sc.nextInt()) {
                    case 1: System.out.println("Pizza - $12"); break;
                    case 2: System.out.println("Ensalada - $7"); break;
                }
                break;
        }
    }
}