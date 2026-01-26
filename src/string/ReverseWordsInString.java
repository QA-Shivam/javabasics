package string;
import java.util.Arrays;

public class ReverseWordsInString {
   /* “Because arrays in Java do not override toString(), so it prints the memory reference.
    To convert char[] to String, we must use new String(charArray)
    */

    public  static  String revStringWords(String str ){
        String [] words= str.trim().split("\\s+");
        int left =0;
        int right=words.length-1;
        while (left<right){
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        String str ="The sky  is  Blue ";
        System.out.println(revStringWords(str));
    }
}
