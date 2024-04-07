import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[3];

        System.err.println("Ingrese 3 numeros");
        for (int i = 0; i < 3; i++)
        {
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("---");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(numeros[i]);
        }
    }
}