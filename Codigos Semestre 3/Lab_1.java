import java.util.Scanner;
import java.util.Arrays;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0, n = 0;

        do {
            System.out.println("Ingrese dos numeros separados por un espacio:");
            String entrada = scanner.nextLine();

            String[] numeros = entrada.split(" ");

            System.out.println("Numeros ingresados: " + numeros[0] + " " + numeros[1]);

            if (numeros.length != 2) {
                System.out.println("Error");
            } else {
                m = Integer.parseInt(numeros[0]);
                n = Integer.parseInt(numeros[1]);
            }

        } while (m < 0 || m > 10000 || n < 0 || n > 10000);

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor perteneciente a " + "[" + i + "][" + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz creada con éxito");

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }



        scanner.close();
    }
}