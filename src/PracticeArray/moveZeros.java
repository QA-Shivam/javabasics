package PracticeArray;

import java.util.Arrays;

public class moveZeros {

    public static int[] moveZeros(int arr[]){
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
        int arr[]={2,4,0,9,0,1};
        System.out.println(Arrays.toString(moveZeros(moveZeros(arr))));
    }
}
