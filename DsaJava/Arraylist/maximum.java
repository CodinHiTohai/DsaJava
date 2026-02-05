import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(4);

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest=list.get(i);
            }
        }
        System.out.println(largest);
    }
}
