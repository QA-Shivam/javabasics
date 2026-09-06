package PracticeArray;

import java.util.Arrays;
import java.util.Collections;

public class get2ndlargest {
    public static void main(String[] args) {
        int arr[]= {2,4,5,9,17,18};
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        for (int c: arr){
            if (c>largest){
                secLargest=largest;
                largest=c;
            } else if (c>secLargest && c!=largest) {
                secLargest=c;
            }
        }
        System.out.println(secLargest);
    }

}
