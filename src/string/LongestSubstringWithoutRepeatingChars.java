package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    public  static  int longestsubstrlen(String str){
        Set<Character> set= new HashSet<>();
        int maxLength=0;
        int left=0;
        for (int right=0;right<str.length();right++){
            while (set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            // old best and current length
            maxLength= Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(longestsubstrlen("shiivam"));
    }
}
