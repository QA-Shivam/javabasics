package PracticeString;

public class ReverseWordsInString {
    public static String ReverseWordsInString(String str){
        String s[]= str.trim().split("\\s+");
            int left=0;
            int right=s.length-1;
            while (left<right) {
                String tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
            return String.join(" ",s);
    }
    public static void main(String[] args) {
        System.out.println(ReverseWordsInString("The Sky"));
    }
}
