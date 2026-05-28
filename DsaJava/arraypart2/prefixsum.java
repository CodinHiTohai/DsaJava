

public class prefixsum {
    public static int sumprefix (int num[]){
        int largest=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                sum= start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(sum>largest){
                    largest=sum;
                }


            }
        }
        
    return largest;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        System.out.println(sumprefix(num));
    }
}
