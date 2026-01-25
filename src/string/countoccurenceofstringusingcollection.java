package string;

import java.util.Map;
import java.util.stream.Collectors;

public class countoccurenceofstringusingcollection {
    public static void main(String[] args) {
        String str ="i love java";
        Map<Character,Long> result= str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result);
    }
}
