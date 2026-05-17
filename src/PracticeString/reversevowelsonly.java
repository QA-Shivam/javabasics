package PracticeString;

public class reversevowelsonly {
    public static String revVowel(String str){
        String vowel="aeiouAEIOU";
        char ch[]=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while (left<right){
            if (vowel.indexOf(ch[left])==-1){
                left++;
            } else if (vowel.indexOf(ch[right])==-1) {
                right--;
            }else {
                char t= ch[left];
                ch[left]=ch[right];
                ch[right]=t;
                left++;
                right--;
            }
        }
        return  new String(ch);
    }
    public static void main(String[] args) {
        System.out.println(revVowel("Shivam"));
    }
}
