package Array;

import java.util.Arrays;

public class ShiftZerosToLeft {
    public static int[] ShiftZeros(int arr[]){
    int insert=arr.length-1;
    for (int i=arr.length-1;i>=0;i--){
        if (arr[i]!=0){
            arr[insert]=arr[i];
            insert--;
        }
    }
    while (insert>=0){
        arr[insert--]=0;
    }
    return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,0,1,9,1};
        System.out.println(Arrays.toString(ShiftZeros(arr)));
    }
}
