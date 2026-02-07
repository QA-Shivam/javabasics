package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatingChar {
    public static char getMaxOccuringChar(String s) {
        Map<Character,Long> map = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()));
        long max=0;
        char maxChar=0;
        for (var e : map.entrySet()) {
            if (e.getValue() > max || e.getKey() < maxChar && e.getValue()==max) {
                max = e.getValue();
                maxChar = e.getKey();
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("testsample"));
    }
}
