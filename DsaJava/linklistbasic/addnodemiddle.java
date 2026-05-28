
public class addnodemiddle{
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
public static int size;
    public void addfirstnode(int data){
        
        Node newnode=new Node(data);
        size++;
if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }
    public void addlastnode(int data){
      Node newnode=new Node(data);
      size++;
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
    public void addmiddle(int data,int idx){
      if(idx==0){
         addfirstnode(data);
         return;
      }
      Node newnnode=new Node(data);
      size++;
      Node temp=head;
      int i=0;
      while(i<idx-1){
         temp=temp.next;
         i++;
      }
      newnnode.next=temp.next;
      temp.next=newnnode;
    }
    public static void main(String[] args) {
        addnodemiddle c1 = new addnodemiddle();
        c1.addfirstnode(5);
        c1.addfirstnode(5);
        c1.addlastnode(7);
        c1.addlastnode(2);
        c1.addmiddle(66, 02);
        c1.print();
        System.out.println(c1.size);
    }
}