package PracticeArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateArray {
    public static void main(String[] args) {
        Integer no[]={1,2,3};
        List<Integer>l= Arrays.asList(no);
        Collections.rotate(l,-1);
        System.out.println(l);
    }
}
