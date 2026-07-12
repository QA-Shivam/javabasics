package PracticeString;

public class isPalindrome {
   /* Given a string s, return true if it is a palindrome, otherwise return false.
    A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
    Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).*/

    public static boolean isPalindrome(String s){
       s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        for (int i=0;i<s.length()-1;i++){
            while (left<right){
                if (!Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                    continue;
                } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                    continue;
                }
                if (s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));

    }
}
