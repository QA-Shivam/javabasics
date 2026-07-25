package shivam;

import java.util.Arrays;

public class solution16 {
    public static int[] twoSum(int arr[], int target){
        int left=0;
         int right =arr.length-1;
         while (left<right){
             int sum=arr[left]+arr[right];
             if (sum>target){
                 right--;
             } else if (sum<target) {
                 left++;
             }else {
                 return new int[]{left,right};
             }
         }
         return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,8};
        int t=6;
        System.out.println(Arrays.toString(twoSum(arr,t)));
    }
}
