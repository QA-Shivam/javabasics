package string;

public class checkPangram {
    public static boolean isPangram(String str) {
        if (str == null || str.isBlank() || str.length() < 26) {
            return false;
        }
        char[] c = str.toLowerCase().toCharArray();
        for (char ch : c) {
            if (str.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if (isPangram("The quick brown fox jumps over the lazy dog")) {
            System.out.println(" String is Pangram");
        } else {
            System.out.println("String is not Pangram");
        }
    }
}
