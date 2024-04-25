public class SumaDigitos {

    class LinkedList {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void addLast(int data) {
            if (head == null) {
                head = new Node(data);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data);
            }
        }
    }

    public LinkedList.Node suma(LinkedList.Node Head1, LinkedList.Node Head2) {

        igualarListas(Head1, Head2);

        // Ahora que tenemos ambas listas con los mismos tamaños, podemos sumar digito a
        // digito

        LinkedList.Node current1 = Head1;
        LinkedList.Node current2 = Head2;

        LinkedList result = new LinkedList();

        while (current1 != null && current2 != null) {
            result.addLast(current1.data + current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }

        for (int i = 0; i < getSize(result.head); i++) {
            LinkedList.Node current = result.head;

            while (current.next != null) {
                if (current.data >= 10) {
                    current.data -= 10;
                    current.next.data += 1;
                }
                current = current.next;
            }
        }
        return result.head;
    }

    public void igualarListas(LinkedList.Node head1, LinkedList.Node head2) {
        int size1 = getSize(head1);
        int size2 = getSize(head2);

        if (size1 > size2) {
            LinkedList.Node current = head2;

            while (current.next != null) {
                current = current.next;
            }

            for (int i = 0; i < size1 - size2; i++) {
                LinkedList.Node newNode = new LinkedList().new Node(0, null);
                current.next = newNode;
            }

        } else {
            LinkedList.Node current = head1;

            while (current.next != null) {
                current = current.next;
            }

            for (int i = 0; i < size2 - size1; i++) {
                LinkedList.Node newNode = new LinkedList().new Node(0, null);
                current.next = newNode;
            }
        }
    }

    public int getSize(LinkedList.Node head) {
        LinkedList.Node current = head;
        int size = 0;

        while (current.next != null) {
            current = current.next;
            size++;
        }

        return size;
    }

    public static void main(String[] args) {
        SumaDigitos sumaDigitos = new SumaDigitos();
        LinkedList lista1 = sumaDigitos.new LinkedList();
        LinkedList lista2 = sumaDigitos.new LinkedList();

        lista1.addLast(1);
        lista1.addLast(2);
        lista1.addLast(3);

        lista2.addLast(4);
        lista2.addLast(5);
        lista2.addLast(6);

        LinkedList.Node result = sumaDigitos.suma(lista1.head, lista2.head);

        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}