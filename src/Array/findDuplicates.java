package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class findDuplicates {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
        return  result;
    }

    public static void main(String[] args) {
        int arr[]={2,3,55,3,45,32};
        System.out.println(findDuplicates(arr));
    }
}
