
public class addlast{
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
    public void addlastnode(int data){
      Node newnode=new Node(data);
      if(head==null){
         head=tail=newnode;
         return;
      }
      
      tail.next=newnode;
      tail=newnode;
    }
    public void print(){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data+" ");
         temp=temp.next;
      }
      System.out.println();
    }
    public static void main(String[] args) {
        addlast c1 = new addlast();
        c1.addfirstnode(5);
        c1.addfirstnode(5);
        c1.addlastnode(7);
        c1.addlastnode(2);
        c1.print();
    }
}
