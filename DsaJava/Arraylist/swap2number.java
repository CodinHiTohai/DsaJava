import java.util.ArrayList;

public class swap2number {
    public static void swapnumber(ArrayList<Integer>list,int idx2,int idx3){
        int temp=list.get(idx3);
        list.set(idx3, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx2=2;
        int idx3=3;
swapnumber(list, idx2, idx3);
System.out.println(list);
    }
}
