package PracticeArray;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class nonRepeatingChar {
    public static char nonRepeatingChar(String s){
        Map<Character,Long> fm= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()));
        for (Map.Entry<Character,Long> m:fm.entrySet()){
            if (m.getValue()==1){
                return m.getKey().charValue();
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("xyy"));
    }
}
