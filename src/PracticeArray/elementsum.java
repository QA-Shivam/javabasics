package PracticeArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class elementsum {
    public static void main(String[] args) {
        int arr[]={3,5,6,8};
        int r[]= IntStream.range(0,arr.length).map(a->Arrays.stream(arr,a,arr.length).sum()).toArray();
        System.out.println(Arrays.toString(r));
    }
}
