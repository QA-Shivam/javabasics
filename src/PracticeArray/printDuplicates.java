package PracticeArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class printDuplicates {
    public static void main(String[] args) {
        int arr[]= {3,5,6,7,7,9,0,0,2};
//      ArrayList<Integer> res=  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()))
//                .entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey)
//                .collect(Collectors.toCollection(ArrayList::new));
        int res[]=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                        .entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey)
                        .mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(res));
    }
}
