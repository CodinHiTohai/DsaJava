
public class addfirst{
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

    public void addfirstnode(int data){
        
        Node newnode=new Node(data);
if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }
    public static void main(String[] args) {
        addfirst c1 = new addfirst();
        c1.addfirstnode(5);
        c1.addfirstnode(5);
    }
}
