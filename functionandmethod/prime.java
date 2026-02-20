

public class prime {
    public static boolean checkpime(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
            }
        }
        return prime;
    }
    public static void primeinrange(int n){
        for(int i=2;i<n;i++){
            if(checkpime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=20;
    primeinrange(n);
    }
}
