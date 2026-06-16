package Array;

import java.util.Arrays;

public class ShiftZerosToRight {
    public static int [] ShiftZeros(int arr[]){
        int insert=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[insert]=arr[i];
                insert++;
            }
        }
        while (insert<arr.length){
            arr[insert++]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,0,0,2,9,0};
        System.out.println(Arrays.toString(ShiftZeros(arr)));
    }
}

