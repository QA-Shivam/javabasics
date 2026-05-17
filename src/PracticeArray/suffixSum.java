package PracticeArray;

import java.util.Arrays;

public class suffixSum {
    public static int[] suffixSum(int arr[]){
        int res[]= new int[arr.length];
        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            sum= sum+arr[i];
            res[i]=sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,0,8};
        System.out.println(Arrays.toString(suffixSum(arr)));
    }
}
