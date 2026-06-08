
public class removeinlinklist{
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
         System.out.print(temp.data+" ");
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
    public int removehead(){
if(size==0){
    System.out.println("link list is empty");
    return Integer.MIN_VALUE;
}if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
}
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int removetail(){
        if(size==0){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
temp=temp.next;
i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        removeinlinklist c1 = new removeinlinklist();
        c1.addfirstnode(5);
        c1.addfirstnode(6);
        c1.addlastnode(7);
        c1.addlastnode(2);
        c1.addmiddle(66, 02);
        
        c1.print();
        c1.reverse();
        c1.print();
    }
}
