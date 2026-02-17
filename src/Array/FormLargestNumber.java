package Array;

import java.util.Arrays;

public class FormLargestNumber {

    public static String FormLargestNumber(int arr[]){
        String [] strArr= Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(strArr,(a,b)->(b+a).compareTo(a+b));
        return  String.join("",strArr);
    }
    public static void main(String[] args) {
        int arr[]={2,3,43};
        System.out.println(FormLargestNumber(arr));

    }
}
