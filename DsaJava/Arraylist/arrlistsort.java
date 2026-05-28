import java.util.ArrayList;
import java.util.Collections;

public class arrlistsort {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(47);
        list.add(8);
        list.add(9);
        list.add(22);
        Collections.sort(list);
        System.out.print(list);
        Collections.sort(list,Collections.reverseOrder());//sorting in reverseorder
        System.out.println(list);

    }
}
