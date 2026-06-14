package PracticeString;

public class SecondLargestDigit {
    public static int SecondLargestDigit(String str){
        int largest=-1;
        int secondLargest=-1;
        for (char c: str.toCharArray()){
            if (Character.isDigit(c)){
                int digit=c-'0';
                if (digit>largest){
                    secondLargest=largest;
                    largest=digit;
                } else if (digit>secondLargest && digit!=largest) {
                    secondLargest=digit;
                }
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
         /*
         Second Largest Digit in a String:
        For example, if the input is "str1025rts", you need to find and return the digit 2.
        */

        System.out.println(SecondLargestDigit("Shiba34nerier8"));

    }
}
