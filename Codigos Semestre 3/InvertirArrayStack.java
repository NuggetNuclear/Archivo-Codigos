import java.util.Stack;

public class InvertirArrayStack {
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }    

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]); // Apilamos los elementos del arreglo
        }
        
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop(); // Desapilamos los elementos del stack y los guardamos en el arreglo
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
