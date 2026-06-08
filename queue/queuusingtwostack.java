import java.util.Stack;

public class queuusingtwostack {
    public class ques{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public static boolean isempty(){
            return s1.isEmpty();
        }
        public static void adddata(int data){
            while(!s1.isEmpty()){
                s2.push((s1.pop()));
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isempty()){
                System.out.println("the queu is proper khali");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isempty()){
                System.out.println("the queu is proper khali");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        ques.adddata(1);
        ques.adddata(2);
        ques.adddata(3);
        while(!ques.isempty()){
            System.out.println(ques.peek());
            ques.remove();
        }

    }
}
