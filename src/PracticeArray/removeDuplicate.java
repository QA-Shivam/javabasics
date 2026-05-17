package PracticeArray;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,5,2};
        int []r= Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(r));
    }
}
