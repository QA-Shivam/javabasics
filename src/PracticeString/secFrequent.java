package PracticeString;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class secFrequent {
    public static void main(String[] args) {
        String[] inputStr = {"dog", "cat", "dog", "lion", "cat", "dog", "lion"};
        Map<String,Long> fm= Arrays.stream(inputStr).collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()));
        String res= fm.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).map(Map.Entry::getKey)
                        .skip(1).findFirst().orElse(null);
       System.out.println(res);
    }
}
