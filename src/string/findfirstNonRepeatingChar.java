package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class findfirstNonRepeatingChar {
    public static String firstNonRepeatingCharacter(String str){
        if (str==null || str.isEmpty()){
            return null;
        }
        Character firstChr=null;
        Map<Character,Long> map= str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));

        for (Map.Entry<Character,Long> e : map.entrySet()){
            if (e.getValue()==1){
                firstChr=e.getKey();
                break;
            }
        }
        return  String.valueOf(firstChr);
    }
    public static void main(String[] args) {
        String str = "Kajol";
       String c= firstNonRepeatingCharacter(str);
        if (c==null){
            System.out.println("There is No Non Repeating Character in this given string: "+ str);
        }else {
            System.out.println("First Non Repeating Character in given String:" +str+ " is "+c);
        }

    }
}
