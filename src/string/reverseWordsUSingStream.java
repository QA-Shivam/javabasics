package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseWordsUSingStream {
    public static void main(String[] args) {
        String string="s'teL ekat edoCteeL tsetnoc";
        String str = Arrays.stream(string.trim().split("\\s+"))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(str);
    }
}
