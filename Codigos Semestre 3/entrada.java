import java.util.Scanner; // Importa la clase scanner

public class entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea una instancia de la clase Scanner para interactuar con la entrada del usuario

        System.out.println("Ingrese su nombre: "); //System.out.println() salta automaticamente a la siguiente linea tras imprimir
        String nombre = scanner.next(); // Recibe una cadena de texto

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Recibe un entero

        System.out.println("Ingrese su altura (en m): ");
        Double altura = scanner.nextDouble(); //Recibe un decimal

        System.out.print("Nombre = " + nombre);
        System.out.print("\nEdad = " + edad); //system.out.print no salta automaticamente, por lo que debemos añadir un salto de linea de ser necesario
        System.out.print("\nAltura = " + altura);

        scanner.close(); } // Cierra la instancia de 'Scanner'
}