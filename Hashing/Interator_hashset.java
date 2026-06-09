import java.util.*;
public class Interator_hashset {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("mumbai");
        set.add("patna");
        set.add("delhi");
        set.add("bokaro");
        set.add("punjab");
    // Iterator it=set.iterator();
    // while (it.hasNext()) {
    //     System.out.println(it.next()+" ");
    // }
    for(String s:set){
        System.out.println(s);
    }
    }
}
