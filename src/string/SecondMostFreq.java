package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondMostFreq {
public static char getSecondMostFreq(String str){
    Map<Character,Long> map= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()));
    return map.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
            .skip(1).map(Map.Entry::getKey).findFirst().orElse('\0');
}

    public static void main(String[] args) {
        System.out.println(getSecondMostFreq("aabababa"));
    }
}
