package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class indexofSumTarget {
    public static int [] targetSum(int [] arr, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int required=target-arr[i];
            if (map.containsKey(required)){
                return new int[]{map.get(required),i};
            }
            map.put(arr[i],i);
        }
        return  new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] arr={2,5,6,7};
        int target=0;
        int[] result = targetSum(arr, target);
        if (result[0] == -1) {
            System.out.println("No two elements found whose sum is " + target);
        } else {
            int index1 = result[0];
            int index2 = result[1];
            System.out.println("Index " + index1 + " has value " + arr[index1]);
            System.out.println("Index " + index2 + " has value " + arr[index2]);
            System.out.println("Sum = " + arr[index1] + " + " + arr[index2] + " = "
                    + (arr[index1] + arr[index2]));
        }
    }
}
