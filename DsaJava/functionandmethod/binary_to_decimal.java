

public class binary_to_decimal {
    public static void bintodec(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            dec=dec+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        int n=101;
        bintodec(n);
    }
}
