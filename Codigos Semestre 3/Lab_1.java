import java.util.Scanner;
import java.util.Arrays;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0, n = 0;

        do {
            System.out.println("Ingrese dos numeros separados por un espacio: ");
            m = scanner.nextInt();
            n = scanner.nextInt();

            System.out.println("Numeros ingresados: " + m + " " + n);

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            }
        }

        System.out.println("Ingrese las filas para formar los pares: ");
        int f1 = scanner.nextInt();
        int f2 = scanner.nextInt();


        if (f1 + 1 >= m || f2 + 1 >= m) {
            System.out.println("No existe una fila despues alguna de las filas");
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("{" + matriz[f1][i] + "," + matriz[f2][j] + "}");
                }
            }
            System.out.println(" ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("{" + matriz[f2][i] + "," + matriz[f1][j] + "}");
                }
            }
        }

        scanner.close();

    }
}