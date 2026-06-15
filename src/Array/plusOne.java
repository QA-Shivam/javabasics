package Array;

import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int arr[]){
        for (int i=arr.length-1;i>=0;i--){
            int lastdigit=arr[i];
            if (lastdigit==9){
                arr[i]=0;
            } else {
                arr[i]++;
                return arr;
            }
        }
        int arr1[]=new int[arr.length+1];
        arr1[0]=1;
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
