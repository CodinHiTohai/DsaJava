
public class creation{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        creation c1 = new creation();
        System.out.println("Linked List class created successfully.");
    }
}
