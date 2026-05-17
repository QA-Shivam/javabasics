package PracticeArray;

import java.util.Arrays;

public class twoSumUsingPointers {

    public static int[] tsm(int arr[], int t){
      int left=0;
      int right=arr.length-1;
      int sum=0;
      while (left<right){
          sum=arr[left]+arr[right];
          if (sum<t){
              left++;
          } else if (sum>t) {
              right--;
          }else {
              return new int[]{left,right};
          }
      }
      return new int []{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,8};
        int t=9;
        System.out.println(Arrays.toString(tsm(arr,t)));
    }
}
