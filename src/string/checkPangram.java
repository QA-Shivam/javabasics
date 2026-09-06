package string;

public class checkPangram {
    public static boolean isPangram(String str) {
        if (str == null || str.isBlank() || str.length() < 26) {
            return false;
        }
        for (char c='a';c<='z';c++) {
            if (str.indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if (isPangram("The quick brown  jumps over the lazy dog")) {
            System.out.println(" String is Pangram");
        } else {
            System.out.println("String is not Pangram");
        }
    }
}
