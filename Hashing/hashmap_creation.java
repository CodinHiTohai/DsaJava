import java.util.*;

public class hashmap_creation {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("delhi",58);
        hm.put("china",833);
        hm.put("bhutan",838);
        
        int population=hm.get("china");
        System.out.println(hm.containsKey("delhi"));
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        
    }
}
