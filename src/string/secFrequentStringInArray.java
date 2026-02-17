package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class secFrequentStringInArray {

    public static String secFrequent(String str[]){
        Map<String,Long> map= Arrays.stream(str)
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()));

        return map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed().thenComparing(Map.Entry::getKey)).skip(1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        String[] inputStr = {"dog", "cat", "dog", "lion", "cat", "dog", "lion"};
        System.out.println(secFrequent(inputStr));
    }
}
