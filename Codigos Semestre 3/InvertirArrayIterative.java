public class InvertirArrayIterative
{   
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int temp;
        
        while (start < end) { // Mientras los índices no se crucen
            temp = array[start]; // Guardamos el elemento en la posición start
            array[start] = array[end]; // Reemplazamos el elemento en la posición start por el de la posición end
            array[end] = temp; // Reemplazamos el elemento en la posición end por el guardado en temp
            
            // Actualizamos los índices

            start++;
            end--;
        }
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