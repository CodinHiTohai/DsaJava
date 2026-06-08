import java.util.ArrayList;

public class creation {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(25);
System.out.println(list);
int element=list.get(3);
System.out.println(element);
int c1=list.remove(4);
System.out.println(list);

list.set(2, 55);
System.out.println(list);
System.out.println(list.contains(5));
    }
}
