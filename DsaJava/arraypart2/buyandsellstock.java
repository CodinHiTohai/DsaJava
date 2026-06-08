

public class buyandsellstock {
    public static int stocksell(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profix=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profix);
            }else{
            buyprice=price[i];
        }
            
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(stocksell(price));
    }
}
