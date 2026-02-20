

public class factorial {
    public static void findfactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
System.out.println(fact);
    }
    public static void main(String[] args) {
        int n=5;
        findfactorial(n);
    }
}
