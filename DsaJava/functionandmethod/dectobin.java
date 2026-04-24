public class dectobin{
    public static void decimaltobin(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%2;
            bin=bin+(lastdigit*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        int n=5;
        decimaltobin(n);
    }
}