public class LinkedListMergeIterative {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static Node mergeLists(Node head1, Node head2) {
        Node dummy = new Node(0); // Nodo ficticio para facilitar la manipulación de la lista unida
        Node tail = dummy; // Referencia al final de la lista unida

        // Mientras ambas listas tengan nodos
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                tail.next = head1; // Agrega el nodo de head1 a la lista unida
                head1 = head1.next; // Avanza al siguiente nodo en la lista head1
            } else {
                tail.next = head2; // Agrega el nodo de head2 a la lista unida
                head2 = head2.next; // Avanza al siguiente nodo en la lista head2
            }
            tail = tail.next; // Avanza al final de la lista unida
        }

        // Agrega el resto de los nodos de la lista restante (si hay alguno)
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next; // El siguiente del nodo dummy es la cabeza de la lista unida
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
