package PracticeString;

public class ReverseVowel {
    public static boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    public static String ReverseVowel(String str){
        char ch[]=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while (left<right){
            if (!isvowel(ch[left])){
                left++;
            } else if (!isvowel(ch[right])) {
                right--;
            }else {
                char t= ch[left];
                ch[left]=ch[right];
                ch[right]=t;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        System.out.println(ReverseVowel("Shiva"));
    }
}
