// public class pr {
    
//     static class Queu{
    
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;
//         Queu(int n){
//              arr=new int[n];
//              size=n;
//              rear=-1;
//              front=-1;
            
//         }
//         public static boolean isempty(){
//             return rear==-1&&front==-1;
//         }
//         public static void add(int data){
//             if((rear+1)%size==front){
//                 System.out.println("queu is full");
//                 return;
//             }
//             if(front==-1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;

//         }
//         public static int remove(){
//             if(isempty()){
//                 System.out.println("the queu is empty");
//                 return -1;
//             }
//         int result=arr[front];
//         if(rear==front){
//             rear=front=-1;

//         }else{
//             front=(front+1)%size;
//         }
//         return result;
//         }
//         public static int peek(){
//             if(isempty()){
//                 System.out.println("kahli hai");
//                 return -1;
//             }
//             return arr[front];

//         }
//     }
//     public static void main(String[] args) {
//         Queu q=new Queu(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         while(!q.isempty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
// public class pr{
//     static class Node{
//         int data;
//         Node next;
//          Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Queu{
//         static Node head=null;
//         static Node tail=null;
//         public static boolean isempty(){
//             return head==null && tail==null;
//         }
//         public static void add(int data){
//             Node newnode=new Node(data);
//             if(isempty()){
//                 head=tail=newnode;
//                 return;
//             }
//             tail.next=newnode;
//             tail=newnode;
//         }
//         public static int remove(){
//             if(isempty()){
//                 System.out.println("khali hai");
//                 return -1;
//             }
//             int front=head.data;
//             if(head==tail){
//                 head=tail=null;
//             }else{
//                 head=head.next;
//             }
//             return front;
//         }
// public static int peek(){
//     if(isempty()){
//         System.out.println("khali hai");
//         return -1;
//     }
//     return head.data;
// }
//     }
//     public static void main(String[] args) {
//         Queu q=new Queu();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         while(!q.isempty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
// import java.util.*;
// public class pr{
//     static class Queu{
//         static Stack<Integer>s1=new Stack<>();
//         static Stack<Integer>s2=new Stack<>();
//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }
//         public static void add(int data){
//         while(!s1.isEmpty()){
//     s2.push(s1.pop());
//         }
//         s1.push(data);
//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//     }
//     public int remove(){
//         if(isEmpty()){
//             System.out.println("khali hai");
//             return -1;
//         }
//         return s1.pop();
//     }
//     public int peek(){
//         if(isEmpty()){
//             System.out.println("khali hai" );
//             return -1;
//         }
//         return s1.peek();
//     }
//     }
//     public static void main(String[] args) {
// Queu q=new Queu();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// while(!q.isEmpty()){
//     System.out.println(q.peek());
//     q.remove();
// }
//     }
// }
import java.util.*;
public class pr{
    static class Stack{
        static Queue<Integer>q1=new LinkedList<>();
        static Queue<Integer>q2=new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty()&& q2.isEmpty();
        }
        public static void add(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("khali hai");
                return -1;

            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
top=q1.remove();
if(q1.isEmpty()){
    break;
}
q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
                }

            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("khali hai");
                return -1;

            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
top=q1.remove();

q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                top=q2.remove();
            
                q1.add(top);
                }

            }
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
    s.add(1);
    s.add(2);
    s.add(3);

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.remove();
}
    }
}
