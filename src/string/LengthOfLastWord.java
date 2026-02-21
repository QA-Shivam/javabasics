package string;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int len=0;
        int i=s.length()-1;
        while (i>=0 && s.charAt(i)==' '){
            i--;
        }
        while (i>=0 && s.charAt(i)!=' '){
            i--;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World "));
    }
}
