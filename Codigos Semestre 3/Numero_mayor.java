import java.util.Scanner;

public class Numero_mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int numeros[] = new int[num];

        for (int i = 0; i < num; i++) 
        {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (numeros[i] > numeros[j]) 
                {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println(numeros[num - 1]);

        scanner.close();
    }
}
