import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterative {
    public static void reverseIterative(LinkedList<Integer> list) {
        if (list == null || list.isEmpty() || list.size() == 1) {
            return;
        }

        // Utilizamos un iterador para recorrer la lista
        ListIterator<Integer> forwardIterator = list.listIterator();
        ListIterator<Integer> backwardIterator = list.listIterator(list.size());

        int halfSize = list.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            // Intercambiamos los elementos de los extremos
            Integer temp = forwardIterator.next();
            forwardIterator.set(backwardIterator.previous());
            backwardIterator.set(temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Lista original:");
        System.out.println(list);
        reverseIterative(list);
        System.out.println("Lista invertida (iterativa):");
        System.out.println(list);
    }
}
