

public class maxsubarray {
    
    public static void subarray(int num[]){
        int largest=Integer.MIN_VALUE;
    int sum;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum+=num[k];
                }
                if(sum>largest){
                    largest=sum;
                }
            }

        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        subarray(num);
    }
}


