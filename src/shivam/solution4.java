package shivam;

import java.util.*;
import java.util.stream.Collectors;

public class solution4 {

    public static void main(String[] args) {
        String str="is2 sentence4 This1 a3";
        String words[]=str.split("\\s");
        Map<Integer,String>map= new HashMap<>();
        for (String s: words){
            int wordindex= s.charAt(s.length()-1)-'0';
            String word=s.substring(0,s.length()-1);
            map.put(wordindex,word);
        }
        String result=map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
