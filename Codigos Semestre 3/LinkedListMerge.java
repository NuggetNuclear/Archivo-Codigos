public class LinkedListMerge {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static Node mergeLists(Node head1, Node head2) {
        // Inicializamos el nodo cabeza de la lista unida como null
        Node mergedHead = null;
        Node tail = null;

        // Mientras ambas listas tengan nodos
        while (head1 != null && head2 != null) {
            // Comparamos los valores de los nodos de ambas listas
            if (head1.value <= head2.value) {
                // Si el valor del nodo en la primera lista es menor o igual, lo agregamos a la lista unida
                if (mergedHead == null) {
                    mergedHead = head1;
                    tail = head1;
                } else {
                    tail.next = head1;
                    tail = head1;
                }
                // Avanzamos al siguiente nodo en la primera lista
                head1 = head1.next;
            } else {
                // Si el valor del nodo en la segunda lista es menor, lo agregamos a la lista unida
                if (mergedHead == null) {
                    mergedHead = head2;
                    tail = head2;
                } else {
                    tail.next = head2;
                    tail = head2;
                }
                // Avanzamos al siguiente nodo en la segunda lista
                head2 = head2.next;
            }
        }

        // Si queda algún nodo sin agregar en la primera lista, lo agregamos
        if (head1 != null) {
            if (mergedHead == null) {
                mergedHead = head1;
            } else {
                tail.next = head1;
            }
        }

        // Si queda algún nodo sin agregar en la segunda lista, lo agregamos
        if (head2 != null) {
            if (mergedHead == null) {
                mergedHead = head2;
            } else {
                tail.next = head2;
            }
        }

        return mergedHead;
    }

    public static void main(String[] args) {
        // Creamos las listas enlazadas
        Node lista1 = new Node(1);
        lista1.next = new Node(4);
        lista1.next.next = new Node(6);
        lista1.next.next.next = new Node(7);

        Node lista2 = new Node(2);
        lista2.next = new Node(3);
        lista2.next.next = new Node(5);

        // Unimos las listas
        Node listaUnida = mergeLists(lista1, lista2);

        // Imprimimos la lista unida
        System.out.println("Lista unida:");
        printList(listaUnida);
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}