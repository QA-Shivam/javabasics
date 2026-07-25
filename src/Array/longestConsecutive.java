package Array;

import java.util.HashMap;
import java.util.Map;

public class longestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int longestconsLen=0;
        Map<Integer,Boolean>traverseMap= new HashMap<>();
        for (int n: nums){
            traverseMap.put(n,Boolean.FALSE);
        }
        for (int number :nums){
            int currentLen=1;
            //check forward direction
           int  nextNumber=number+1;
            while (traverseMap.containsKey(nextNumber)&& traverseMap.get(nextNumber)==false){
                traverseMap.put(nextNumber,Boolean.TRUE);
                currentLen++;
                nextNumber++;
            }
            // check in reverse or backward direction
            int previousNumber=number-1;
            while (traverseMap.containsKey(previousNumber)&& traverseMap.get(previousNumber)==false){
                traverseMap.put(nextNumber,Boolean.TRUE);
                currentLen++;
                previousNumber--;
            }
            longestconsLen=Math.max(longestconsLen,currentLen);
        }
        return longestconsLen;
    }

    public static void main(String[] args) {
        int []nums = {2,20,4,10,3,4,5};
        System.out.println(longestConsecutive(nums));

    }
}
