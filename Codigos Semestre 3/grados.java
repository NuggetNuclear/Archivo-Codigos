import java.util.Scanner;

public class grados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué conversión quieres hacer?");
        System.out.println("1. Fahrenheit a Celcius");
        System.out.println("2. Celsius a Fahrenheit");

        int caso;
        caso = scanner.nextInt();

        int grados;

        switch (caso) {
            case 1:
                System.out.println("Ingrese los grados en la escala °F: ");
                grados = scanner.nextInt();
                grados = (grados - 32) * 5 / 9;
                System.out.print("Esto equivale a " + grados + " °C");
                break;
            case 2:
                System.out.println("Ingrese los grados en la escala °C: ");
                grados = scanner.nextInt();
                grados = (grados * 9 / 5) + 32;
                System.out.print("Esto equivale a " + grados + " °F");
                break;
            default:
                break;
        }

        scanner.close();
    }

}
