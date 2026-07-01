package PracticeString;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordsFrequency {
    public static void main(String[] args) {
        String str="the quick brown fox jumps over the lazy dog the fox run";
        String words[]=str.split("\\s");
        Map<String,Integer>map= new LinkedHashMap<>();
        for (String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (String s: map.keySet()){
            System.out.println(s +":"+ map.get(s));
        }
    }
}



