package PracticeString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseWordsUsingStream {
    public static void main(String[] args) {
        String string="s'teL ekat edoCteeL tsetnoc";
        String rev= Arrays.stream(string.trim().split("\\s+")).map(w->new StringBuilder(w).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(rev);
    }
}
