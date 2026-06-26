package PracticeString;

public class ReverseInteger {
    public static int revInt(int x){
      int rev=0;
      while (x!=0){
          // Extract the last digit
          int ld= x%10; //3 2 1
         // This condition is trying to prevent integer overflow.
          if (rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10){
              return 0;
          }

          //Shift existing digits to the left and append the last digit
          rev=(rev*10)+ld; //3 32 321
          // Remove the last digit from the original number
          x=x/10; // 12 1 0
      }
      return rev;
    }
    public static void main(String[] args) {
        int x=123;
        System.out.println(revInt(x));
    }
}
