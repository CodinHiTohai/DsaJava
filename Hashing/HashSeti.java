import java.util.*;

public class HashSeti{
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        if(hs.contains(8)){
            System.out.println("ha isme hai");
        }else{
            System.out.println("nh isme nahi hai");
        }
System.out.println(hs.size());
    }
}