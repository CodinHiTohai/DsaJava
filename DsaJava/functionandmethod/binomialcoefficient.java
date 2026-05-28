

public class binomialcoefficient {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
           
            fact=fact*i;
        }
        return fact;
    }
    public static int binomialcoefficient(int n,int r){
    int fact_n=factorial(n);
    int factr=factorial(r);
    int factn_m=factorial(n-r);
    int bincor=fact_n/(factr*factn_m);
    return bincor;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(binomialcoefficient(n, r));
    }
}
