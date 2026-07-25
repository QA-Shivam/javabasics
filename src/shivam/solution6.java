package shivam;

public class solution6 {
    public static boolean isPalindrome(String str){
        char ch[]=str.toLowerCase().toCharArray();
        int left=0;
        int right=ch.length-1;
        while (left<right){
            if (!Character.isLetterOrDigit(ch[left])){
                left++;
                continue;
            } else if (!Character.isLetterOrDigit(ch[right])) {
                right--;
                continue;
            }
            if (ch[left]!=ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}
