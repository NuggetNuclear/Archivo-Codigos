import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        double ans = 0, var1, var2;
        char op;

        var1 = scanner.nextDouble();
        System.out.print("Operacion: ");
        do {

            op = scanner.next().charAt(0);
            var2 = scanner.nextDouble();

            switch (op) {
                case '+':
                    ans = var1 + var2;
                    break;
                case '-':
                    ans = var1 - var2;
                    break;

                case '*':
                    ans = var1 * var2;
                    break;
                case '/':

                    if (var2 == 0) {
                        System.err.println("Division por 0");
                        break;
                    } else {
                        ans = var1 / var2;
                    }
                    break;
            }

            var1 = ans;
            System.out.print("Pensando");
            for(int i = 0; i < 19; i++)
            {
                Thread.sleep(500);
                System.out.print(".");
            }

            System.out.println("\nHola Mundo");
            System.out.println("© Gabriel - 2024");

        } while (op != 'e');
        scanner.close();
    }
}
