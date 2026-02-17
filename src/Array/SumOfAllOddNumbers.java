package Array;

import java.util.Arrays;

public class SumOfAllOddNumbers {
    public static int sumOfOdds(int[] arr){
        return Arrays.stream(arr).filter(e->e%2!=0).sum();
    }
    public static void main(String[] args) {
        int arr[]={2,2,5,6,1};
        System.out.println(sumOfOdds(arr));
    }
}
