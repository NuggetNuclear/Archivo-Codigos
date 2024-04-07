import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamaño del arreglo: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nIngrese el dato N°: " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Arreglo desordenado:\n");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " Posición: " + i);
        }

        System.out.println("\nArreglo ordenado:\n");

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " Posición: " + i);
        }

        scanner.close();
    }
}
