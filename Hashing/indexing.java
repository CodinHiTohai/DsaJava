import java.util.*;

public class indexing {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india", 59);
        hm.put("japan",83);
        hm.put("bhutam",83);
        
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        
for (String k : keys) {
    System.out.println("key="+k+"value="+hm.get(k));
}
    }
}
