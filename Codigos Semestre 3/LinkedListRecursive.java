import java.util.LinkedList;

public class LinkedListRecursive {
    public static void reverseRecursive(LinkedList<Integer> list) {
        if (list == null || list.isEmpty() || list.size() == 1) {
            return;
        }

        // Llamada inicial a la función recursiva
        reverseRecursiveHelper(list, 0, list.size() - 1);
    }

    // Función recursiva auxiliar para invertir la lista
    private static void reverseRecursiveHelper(LinkedList<Integer> list, int start, int end) {
        if (start >= end) {
            return;
        }

        // Intercambiamos los elementos en los índices start y end
        Integer temp = list.get(start);
        list.set(start, list.get(end));
        list.set(end, temp);

        // Llamada recursiva con los índices actualizados
        reverseRecursiveHelper(list, start + 1, end - 1);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Lista original:");
        System.out.println(list);
        reverseRecursive(list);
        System.out.println("Lista invertida (recursiva):");
        System.out.println(list);
    }
}
