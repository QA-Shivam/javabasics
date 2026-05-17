package PracticeString;

public class palindromstring {
    public static boolean isPalindrome(String string){
        if (string==null){
            return false;
        }
        int l=0;
        int r=string.length()-1;
        while (l<r){
            if (string.charAt(l)!=string.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        if (isPalindrome("Deamon")){
            System.out.println("It's palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
