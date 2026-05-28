public class check_palindrone {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    
public static Node head;
public static Node tail;
public static int size;
public void addfirst(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
newnode.next=head;
head=newnode;

}
public void addlast(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
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
        addfirst(data);
        return;
    }
    Node newnode=new Node(data);
    size++;

    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;

    }
    newnode.next=temp.next;
    temp.next=newnode;


}
public int removefirst(){
    if(size==0){
        System.out.println("link list is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
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
public int removelast(){
    if(size==0){
        System.out.println("the linklist is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev=head;;
    for(int i=0;i<size-2;i++){
           prev=prev.next;
    }
    int val=head.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;


}
public int search(int key){
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
public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }return idx+1;
}
public int recursive(int key){
    return helper(head,key);
}
public Node findmid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null &&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    return slow;
}
public boolean checkpalidrone(){
    if(head == null || head.next == null){
        return true;
    }

    
    Node mid = findmid(head);

    
    Node prev = null;
    Node curr = mid;
    while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    
    Node right = prev;
    Node left = head;
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}

    public static void main(String[] args) {
        check_palindrone g1=new check_palindrone();
        g1.addfirst(4);
        g1.addfirst(67);
        g1.addlast(88);
        g1.addlast(99);
        g1.addmiddle(766, 2);
    
        g1.removelast();
        g1.print();
    System.out.println(g1.search(4));
    System.out.println(g1.recursive(88));
    System.out.println(g1.checkpalidrone());

    }
}


