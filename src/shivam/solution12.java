package shivam;

import java.util.Arrays;

public class solution12 {
    public static int [] shiftRight(int [] arr){
        int insert=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[insert]=arr[i];
                insert++;
            }
        }
        while (insert< arr.length){
            arr[insert++]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,0,5,0,6};
        System.out.println(Arrays.toString(shiftRight(arr)));
    }
}
