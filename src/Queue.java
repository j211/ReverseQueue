public class Queue {

    public Node initQueue(int[] listValues) {
        Node node = null;

        for(int i = listValues.length - 1; i >= 0; --i) {
            node = new Node(listValues[i], node);
        }

        return node;
    }

    public void printQueue(Node head) {
        for(Node current = head; current != null; current = current.getNext()) {
            System.out.print(current.getData() + " ");
        }

        System.out.println();
    }

    public Node reverseQueue(Node head) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            Node next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }
}
