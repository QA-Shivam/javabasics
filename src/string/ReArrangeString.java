package string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReArrangeString {

    public static String reArrangeString(String str){
        String [] words= str.split("\\s+");
        Map<Integer,String> map= new HashMap<>();
        for (String word :words){
            int wordindex=word.charAt(word.length()-1)-'0';
            String actualword= word.substring(0,word.length()-1);
            map.put(wordindex,actualword);
        }
       return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(reArrangeString("is2 sentence4 This1 a3"));
    }
}
