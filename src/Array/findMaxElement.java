package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMaxElement {
public static int getMaxElement(List<Integer> integers){
return  integers.stream().max(Comparator.comparing(Integer::valueOf)).get();
}
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(2,4,56,79,4,3,1);
        System.out.println(getMaxElement(arr));
    }
}
