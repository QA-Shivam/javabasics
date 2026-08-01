package string;

public class findTheDifference {
    public static char findTheDifference(String s, String t) {
        char ans=0;
        for (char c: s.toCharArray()){
            ans^=c;
        }
        for (char c: t.toCharArray()){
            ans^=c;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

/*  I'll use the XOR operator. The key property of XOR is that if we XOR the same value twice.
    it becomes 0 (x ^ x = 0). Also, XOR with 0 gives the same value (x ^ 0 = x).
    So I'll XOR all the characters from both strings. Every character that appears in both strings will cancel out, and only the extra character will remain.
    */
}
