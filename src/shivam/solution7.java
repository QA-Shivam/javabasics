package shivam;

public class solution7 {
    public static boolean isPalindrome(String s){
      char ch[]=s.toCharArray();
      int left=0;
      int right=ch.length-1;
      while (left<right){
          if (ch[left]!=ch[right]){
              return false;
          }
          left++;
          right--;
      }
      return true;
    }

    public static void main(String[] args) {
        String str= "NaN";
        System.out.println(isPalindrome(str));
    }
}
