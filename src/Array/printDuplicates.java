package Array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class printDuplicates {
    public static int [] printDuplicates(int arr[]){
      return   Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1)
                .map(Map.Entry::getKey).mapToInt(Integer::valueOf).toArray();
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,9,2,1,4,9};
        System.out.println(Arrays.toString(printDuplicates(arr)));
    }
}
