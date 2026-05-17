package PracticeArray;

import java.util.Arrays;

public class get2ndsmallest {
    public static void main(String[] args) {
        int []arr={3,1,5,7,8,9};
        int result= Arrays.stream(arr).boxed().distinct().sorted().skip(1).findFirst().orElse(-1);
        System.out.println(result);
    }
}
