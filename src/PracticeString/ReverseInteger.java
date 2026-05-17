package PracticeString;

public class ReverseInteger {
    public static int revInt(int x){
      int rev=0;
      while (x!=0){
          int ld= x%10;
          if (rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10){
              return 0;
          }
          rev=(rev*10)+ld;
          x=x/10;
      }
      return rev;
    }
    public static void main(String[] args) {
        int x=123;
        System.out.println(revInt(x));
    }
}
