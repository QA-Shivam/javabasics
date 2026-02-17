package Array;

import java.util.Arrays;

public class SumofAllElements {

    public static int sumOfAllElements(int[] arr){
        return Arrays.stream(arr).sum();
    }
    public static void main(String[] args) {
        int arr[]={2,34,5,6};
        System.out.println(sumOfAllElements(arr));
    }
}
