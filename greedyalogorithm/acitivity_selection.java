import java.util.*;
public class acitivity_selection {
    public static void main(String[] args) {
       int start[]={1,3,0,5,8,5};
       int end[]={2,4,6,7,9,9};
       int myact=0;
       ArrayList<Integer>ans=new ArrayList<>();
       myact=1;
       ans.add(0);
       int lastend=end[0];
       for(int i=1;i<end.length;i++){
        if(start[i]>lastend){
            myact++;
            ans.add(i);
            lastend=end[i];
        }
       }
System.out.println("acitivities is "+myact);
for(int i=0;i<ans.size();i++){
    System.out.println("A"+ans.get(i));
}
    }
}
