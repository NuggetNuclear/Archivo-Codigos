class LinkedList {
    class Node {
        int value;
        Node next;
    }
    Node Head;
}    

public class LinkedListImplementation {  
    public static void main(String[] args) 
        {
            LinkedList lista = new LinkedList(); // Creamos una instancia de la lista enlazada
    
            // Creamos los nodos y les asignamos valores
            LinkedList.Node nodo1 = lista.new Node(); nodo1.value = 1;
            LinkedList.Node nodo2 = lista.new Node(); nodo2.value = 2;
    
            // Establecemos los enlaces
            lista.Head = nodo1; // Establecemos el primer nodo como cabeza de la lista
            nodo1.next = nodo2; // El siguiente nodo después de nodo1 es nodo2
    
            // Ahora, para añadir un nuevo nodo al final de la lista:
            LinkedList.Node nuevoNodo = lista.new Node(); nuevoNodo.value = 3;
            // Declaracion de tipo ------ Creación del Nodo

    
            LinkedList.Node ultimoNodo = encontrarUltimoNodo(lista); // Encontramos el último nodo en la lista
            ultimoNodo.next = nuevoNodo; // Establecemos el enlace del último nodo al nuevo nodo
    
            // La lista ahora tiene nodos con valores 1, 2, y 3, en ese orden
        }
    
        // Método auxiliar para encontrar el último nodo en la lista
        private static LinkedList.Node encontrarUltimoNodo(LinkedList lista) {
            LinkedList.Node nodoActual = lista.Head; // Comenzamos desde el nodo inicial
    
            while (nodoActual.next != null) {
                nodoActual = nodoActual.next; // Avanzamos al siguiente nodo
            }
    
            return nodoActual;
        }
}

