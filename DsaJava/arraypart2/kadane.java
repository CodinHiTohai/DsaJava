

public class kadane {
    public static void sumkadane(int num[]){
        int largest=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
            if(sum<0){
                sum=0;
            }
            largest=Math.max(largest, sum);
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        sumkadane(num);

    }
}
