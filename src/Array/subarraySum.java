package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class subarraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
       ArrayList<Integer> result = new ArrayList<>();
       int sum=0;
       int i=0;
       int j=0;
        for (i=0;i<arr.length;i++){
            sum=sum+arr[i];
            while (sum>target && j<i){
                sum=sum-arr[j++];
            }
            if(sum==target){
                result.add(j+1);
                result.add(i+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr,target));
    }
}
