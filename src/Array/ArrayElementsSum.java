package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayElementsSum {


    public static int [] sumElements(int arr[]){
    return IntStream.range(0,arr.length).map(a-> Arrays.stream(arr,a,arr.length).sum()).toArray();
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,7};
        System.out.println(Arrays.toString(sumElements(arr)));
    }
}
