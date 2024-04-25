public class InvertirArrayRecursive {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        reverseArrayHelper(array, 0, array.length - 1);
    }

    public static void reverseArrayHelper(int[] array, int start, int end) {
        if (start >= end) { // Si los índices se cruzan
            return;
        }

        // Intercambiamos los elementos en los índices start y end
        int temp = array[start]; // Guardamos el elemento en la posición start
        array[start] = array[end]; // Reemplazamos el elemento en la posición start por el de la posición end
        array[end] = temp; // Reemplazamos el elemento en la posición end por el guardado en temp

        // Llamada recursiva con los índices actualizados
        reverseArrayHelper(array, start + 1, end - 1); // Lamamos nuevamente a la función con los índices actualizados
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original:");
        printArray(array);
        
        reverseArray(array);
        
        System.out.println("\nArreglo invertido:");
        printArray(array);
    }
}
