package PracticeArray;

import java.util.Arrays;

public class formLargestNo
{
    public static String fln(int[] arr){
    String [] str= Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
    Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
      return   String.join("",str);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,22};
        System.out.println(fln(arr));
    }
}
