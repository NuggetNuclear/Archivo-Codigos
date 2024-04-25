import java.util.LinkedList;
import java.util.ListIterator;

public class InvertirLinkedListIterative {
    public static void reverseIterative(LinkedList<Integer> list) {
        if (list == null || list.isEmpty() || list.size() == 1) { // Si la lista está vacía
            return;
        }

        // Utilizamos un iterador para recorrer la lista
        ListIterator<Integer> forwardIterator = list.listIterator();
        ListIterator<Integer> backwardIterator = list.listIterator(list.size());

        int halfSize = list.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            // Intercambiamos los elementos de los extremos
            System.out.println("Intercambiando elementos en las posiciones " + (i+1) + " y " + (list.size() - i));
            Integer temp = forwardIterator.next();                      // Obtenemos el elemento en la posición i
            forwardIterator.set(backwardIterator.previous());           // Reemplazamos el elemento en la posición i por el de la posición n-i
            backwardIterator.set(temp);                                 // Reemplazamos el elemento en la posición n-i por el de la posición i
            System.out.println("Elementos intercambiados: " + list);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("Lista original:");
        System.out.println(list);
        reverseIterative(list);
        System.out.println("Lista invertida (iterativa):");
        System.out.println(list);
    }
}
