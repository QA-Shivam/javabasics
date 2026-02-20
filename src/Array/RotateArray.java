package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {

    public static List<Integer> RotateArray(Integer []arr,int k){
        List<Integer> l= Arrays.asList(arr);
        Collections.rotate(l,k);
        return l;
    }
    public static void main(String[] args) {
        Integer [] arr={2,3,4,5,6};
        int k=-1;
        System.out.println(RotateArray(arr,k));
    }
}
