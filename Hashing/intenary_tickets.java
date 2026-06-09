import java.util.*;

public class intenary_tickets {
    public static String startpoint(HashMap<String,String>tickets){
        HashMap<String,String>revmap=new HashMap<>();
        for(String s:revmap.keySet()){
            revmap.put(tickets.get(s), s);
        }
        for(String s:tickets.keySet()){
if(!revmap.containsKey(s)){
    return s;
}
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
String start=startpoint(tickets);
System.out.print(start);
for(String s:tickets.keySet()){
System.out.print("->"+tickets.get(start));
start=tickets.get(start);
}

System.out.println();
    }
}
