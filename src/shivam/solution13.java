package shivam;

import java.util.Arrays;

public class solution13 {
    public static int[] shiftLeft(int arr[]){
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
        int arr[]={1,0,5,0,3};
        System.out.println(Arrays.toString(shiftLeft(arr)));
    }
}
