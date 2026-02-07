package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicateLetters {
    public static void main(String[] args) {
        String str= "zvvo";
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            if (set.contains(str.charAt(i))){
                continue;
            }
            set.add(str.charAt(i));
        }
        System.out.println(set.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
