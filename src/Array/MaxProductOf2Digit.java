package Array;

public class MaxProductOf2Digit {
    public static int maxProduct(int n) {
        int firstDigit=0;
        int secondDigit=0;
        while (n>0){
            int lastDigit=n%10;
            if (lastDigit>firstDigit){
                secondDigit=firstDigit;
                firstDigit=lastDigit;
            }else if (lastDigit>secondDigit){
                secondDigit=lastDigit;
            }
            n=n/10;
        }
        return firstDigit*secondDigit;
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(345));
    }
}
