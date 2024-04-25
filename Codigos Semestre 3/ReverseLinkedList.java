import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class ReverseLinkedList {
    public static void invert(LinkedList<Integer> Lista) {
        Queue<Integer> Cola = new LinkedList<>();

        while (!Lista.isEmpty()) { // Almacena temporalmente la lista en una cola, cada vez que saca un dato lo borra
            Cola.add(Lista.poll()); }

        while (!Cola.isEmpty()) {  // Pasa los datos de la cola de vuelta a la lista pero invertidos
            Lista.addFirst(Cola.poll()); }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos que tiene la linked List: ");
        int size = input.nextInt();

        LinkedList<Integer> Lista = new LinkedList<>(); // Crea la lista

        for (int i = 0; i < size; i++) { // Pide los datos por consola
            System.out.println("Ingrese el dato para poner en la posición " + (i + 1) + ": ");
            Lista.add(input.nextInt()); }

        input.close(); // Cierra el scanner

        System.out.println(Lista);

        invert(Lista); // Llama a la función e invierte la lista

        System.out.println(Lista);
    }
}
