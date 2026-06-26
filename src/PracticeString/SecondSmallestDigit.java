package PracticeString;

public class SecondSmallestDigit {
    public static int SecondSmallestDigit(String str){
        int smallest= Integer.MAX_VALUE;
        int secsmallest=Integer.MAX_VALUE;
        for (char c: str.toCharArray()){
            if (Character.isDigit(c)){
                int digit=c-'0';
                if (digit<smallest){
                    secsmallest=smallest;
                    smallest=digit;
                } else if (digit<secsmallest && digit!=smallest) {
                    secsmallest=digit;
                }
            }
        }
        return secsmallest;
    }

    public static void main(String[] args) {
        String string= "Jav2aProg45ming2";
        System.out.println(SecondSmallestDigit(string));
    }
}
