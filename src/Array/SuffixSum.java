package Array;

import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int [] arr={2,3,5};
        int result[]=new int[arr.length];
        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            sum=sum+arr[i];
            result[i]=sum;
        }
        System.out.println(Arrays.toString(result));

    }
}
