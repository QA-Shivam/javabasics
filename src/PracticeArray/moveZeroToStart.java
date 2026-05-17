package PracticeArray;

import java.util.Arrays;

public class moveZeroToStart {
    public static int[] moveZeroToStart(int arr[]){
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
        int arr[]={2,4,0,9,0,1};
        System.out.println(Arrays.toString((moveZeroToStart(arr))));
    }
}
