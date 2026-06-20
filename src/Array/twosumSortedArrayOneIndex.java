package Array;

import java.util.Arrays;

public class twosumSortedArrayOneIndex {

    public static int[] TwosumArrayOneIndex(int[] arr,int traget ){
        int right=0;
        int left=arr.length-1;
        while (right<left){
            int sum=arr[left]+arr[right];
            if(sum<traget){
                right++;
            }else if(sum>traget){
                left--;
            }else {
                return new int[]{ right + 1,left+1};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] arr={-2,-4,-5,-6,9};
        int target=7;
        System.out.println(Arrays.toString(TwosumArrayOneIndex(arr,target)));
    }
}
