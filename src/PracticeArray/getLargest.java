package PracticeArray;

import java.util.Arrays;

public class getLargest {
    public static int getLargest(int [] arr){
      return   Arrays.stream(arr).max().getAsInt();
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 35};
        System.out.println(getLargest(arr));
    }
}
