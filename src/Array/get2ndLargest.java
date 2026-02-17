package Array;

import java.util.Arrays;
import java.util.Collections;


public class get2ndLargest {

    public static int get2ndLargest(int arr[]){
       return Arrays.stream(arr).boxed().
               distinct().sorted(Collections.reverseOrder())
               .skip(1).findFirst().orElse(-1);
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34,34};
        System.out.println(get2ndLargest(arr));
    }
}
