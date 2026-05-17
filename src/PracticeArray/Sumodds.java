package PracticeArray;

import java.util.Arrays;

public class Sumodds {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,4};
        int a= Arrays.stream(arr).filter(x->x%2!=0).sum();
        System.out.println(a);
    }
}
