
public class using_linklist {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        static class queu{
            static Node head=null;
            static Node tail=null;

        
        public static boolean isempty(){
            return head==null &&tail==null;
        }
        public static void addfirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove(){
            if(isempty()){
                System.out.println("this is totally khali");
                return -1;
            }
            int front=head.data;
            if(head==tail){
                head=tail=null;
                
            }else{
                head=head.next;
            }
            return front;
        }
        public static int peek(){
            if(isempty()){
                System.out.println("this is totally khali");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queu g=new queu();
        g.addfirst(1);
        g.addfirst(2);
        g.addfirst(3);
        while (!g.isempty()) {
            System.out.println(g.peek());
            g.remove();

        }
    }
}
