package PracticeString;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RearrangeString {
    public static String reArrangeString(String str) {
        Map<Integer,String> map= new HashMap<>();
        String [] words= str.trim().split("\\s+");
        for (String s: words){
            int wordindex= s.charAt(s.length()-1)-'0';
            String word= s.substring(0,s.length()-1);
            map.put(wordindex,word);
        }
        return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(reArrangeString("is2 sentence4 This1 a3"));
    }
}
