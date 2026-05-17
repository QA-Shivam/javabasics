package PracticeString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondMostFreq {
    public static char SecondMostFreq(String str){
        Map<Character,Long> fremap= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()));
        return fremap.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
                .map(Map.Entry::getKey).skip(1).findFirst().orElse('\0');


    }
    public static void main(String[] args) {
        String s= "abbcaa";
        System.out.println(SecondMostFreq(s));
    }
}
