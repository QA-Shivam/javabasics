package PracticeArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxElement {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(2,4,56,79,4,3,1);
        int ar=arr.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(ar);
    }
}
