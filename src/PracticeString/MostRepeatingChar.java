package PracticeString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatingChar {
    public static char getMaxOccuringChar(String str){
        Map<Character,Long> fm= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));
        long max=0;
        char maxchar=0;
       for (var e: fm.entrySet()){
           if (e.getValue()>max|| e.getKey()<maxchar && e.getValue()==max){
               max=e.getValue();
               maxchar=e.getKey();
           }
       }
       return maxchar;
    }
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("abba"));
    }
}
