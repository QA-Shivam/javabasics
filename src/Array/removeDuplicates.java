package Array;

import java.util.Arrays;

public class removeDuplicates {
    public static int[] removeDuplicates(int[] nums) {

        return Arrays.stream(nums).distinct().toArray();
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
