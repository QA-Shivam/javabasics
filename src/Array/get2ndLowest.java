package Array;

import java.util.Arrays;

public class get2ndLowest {
    public static  int get2ndLowest(int [] arr){
        return  Arrays.stream(arr).sorted().boxed().distinct().skip(1).findFirst().get();
    }
    public static void main(String[] args) {
        int arr[] = {10, 3, 1, 10, -1,-2};
        System.out.println(get2ndLowest(arr));
    }
}
