class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class linkedListManual {

    public static void main(String[] args) {
        // Creating individual nodes
        Node third = new Node(3, null);
        Node second = new Node(2, third);
        Node first = new Node(1, second);

        // Head points to first node
        Node head = first;

        // Traverse and print
        System.out.println("Linked List elements:");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
