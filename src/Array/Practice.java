package Array;

import java.util.*;

public class Practice {
    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> result= new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum>target){
                right--;
            } else if (sum<target) {
                left++;
            }else {
                result.add(left+1);
                result.add(right+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int [] arr={2, 7, 11, 15};
        int target=9;
        System.out.println(twoSum(arr,target));

    }
}
