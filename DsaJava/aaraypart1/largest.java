public class largest {
    public static int findlagest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={5,8,9,10,4};
    System.out.println(findlagest(num));
    }
}
