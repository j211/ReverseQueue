//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] listValues = new int[]{4, 7, 23, 0, 5, 11, 6, 8, 45};
        Queue queue = new Queue();
        Node head = queue.initQueue(listValues);
        queue.printQueue(head);
        Node reverseHead = queue.reverseQueue(head);
        queue.printQueue(reverseHead);
    }
}