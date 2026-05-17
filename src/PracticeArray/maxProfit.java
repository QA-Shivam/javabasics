package PracticeArray;

public class maxProfit {
    public static void main(String[] args) {
        int prices[]={5,1,3,7};
        int bp=prices[0];
        int mp=0;
        for(int i=0;i<prices.length;i++){
            if (prices[i]<bp){
                bp=prices[i];
            }else {
                int cp=prices[i]-bp;
                mp=Math.max(cp,mp);
            }
        }
        System.out.println(mp);
    }
}
