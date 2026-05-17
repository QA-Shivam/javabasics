package PracticeArray;

import java.util.Arrays;
import java.util.Collections;

public class get2ndlargest {
    public static void main(String[] args) {
        int arr[]= {2,4,5,9,17,18};
        int res= Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(res);
    }
}
