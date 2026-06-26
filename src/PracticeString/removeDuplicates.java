package PracticeString;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static String removeDuplicates(String str){
        Set<Character> set= new LinkedHashSet<>();// LinkedHashSet preserve insertion order
        char []ch=str.toCharArray();
        for (char c: ch){
            if (set.contains(c)){
                continue;
            }
            set.add(c);
        }
        return set.stream().map(String::valueOf).collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String str="Ambitions";
        System.out.println(removeDuplicates(str));
    }
}
