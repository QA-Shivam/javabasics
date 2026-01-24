package string;

public class checkPangramUsingRegex {
    public static boolean isPangram(String str) {
        if (str == null || str.isBlank() || str.length() < 26) {
            return false;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            String regex = "(?i).*" + c + ".*";
            if (!str.matches(regex)) {
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
