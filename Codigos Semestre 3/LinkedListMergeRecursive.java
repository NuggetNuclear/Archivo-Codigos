public class LinkedListMergeRecursive {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static Node mergeLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.value < head2.value) {
            head1.next = mergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }
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
