package Array;

public class maxProfit {
    public static int maxProfit(int[] prices) {
       int maxProfit=0;
       int buyPrice=prices[0];
       for (int i=0;i<prices.length;i++){
           if(buyPrice>prices[i]){
               buyPrice=prices[i];
           }else {
               int currentProfit=prices[i]-buyPrice;
               maxProfit=Math.max(currentProfit,maxProfit);
           }
       }
       return  maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
