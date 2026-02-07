package string;

import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicates {
   public static String removeDuplicates(String s) {
       Set<Character> set= new LinkedHashSet<>();
       for (int i=0;i<s.length();i++){
           if(!set.contains(s.charAt(i))){
               set.add(s.charAt(i));
           }
       }
       return set.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("Ambitions"));
    }
}
