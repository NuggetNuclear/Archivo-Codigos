import java.util.LinkedList;

public class InvertirLinkedListRecursive {
    public static void reverseRecursive(LinkedList<Integer> list) {
        if (list == null || list.isEmpty() || list.size() == 1) { // Si la lista está vacía o tiene 1 elemento
            return;
        }

        // Llamada inicial a la función recursiva
        reverseRecursiveHelper(list, 0, list.size() - 1);
    }

    // Función recursiva auxiliar para invertir la lista
    private static void reverseRecursiveHelper(LinkedList<Integer> list, int start, int end) {
        if (start >= end) { // Si los índices se cruzan
            return;
        }

        // Intercambiamos los elementos en los índices start y end
        Integer temp = list.get(start); // Guardamos el elemento en la posición start
        list.set(start, list.get(end)); // Reemplazamos el elemento en la posición start por el de la posición end
        list.set(end, temp);            // Reemplazamos el elemento en la posición end por el guardado en temp

        // Llamada recursiva con los índices actualizados
        reverseRecursiveHelper(list, start + 1, end - 1); // Lamamos nuevamente a la función con los índices actualizados
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
        reverseRecursive(list);
        System.out.println("Lista invertida (recursiva):");
        System.out.println(list);
    }
}
