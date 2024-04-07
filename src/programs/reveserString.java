package programs;

public class reveserString {
    public static String reverseString(String inputString) {
        StringBuilder result = new StringBuilder(inputString);
        int i = 0;
        int j = inputString.length() - 1;

        while (i < j) {
            // Skip spaces from the start
            while (i < j && result.charAt(i) == ' ') {
                i++;
            }
            // Skip spaces from the end
            while (i < j && result.charAt(j) == ' ') {
                j--;
            }
            // Swap characters
            char temp = result.charAt(i);
            result.setCharAt(i, result.charAt(j));
            result.setCharAt(j, temp);

            i++;
            j--;
        }

        return result.toString();

    }

    public static void main(String[] args) {
    System.out.println(reverseString("Shivan uma d"));
    }
}