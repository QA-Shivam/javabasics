package PracticeArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int arr[], int target){
       Map<Integer,Integer> m= new HashMap<>();
       for (int i=0;i<arr.length;i++){
           int req= target-arr[i];
           if (m.containsKey(req)){
               return new int[]{m.get(req),i};
           }
           m.put(arr[i],i);
       }
       return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int [] arr={2,4,6,9};
        int target =13;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
