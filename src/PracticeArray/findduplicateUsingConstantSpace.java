package PracticeArray;

import java.util.ArrayList;
import java.util.List;

public class findduplicateUsingConstantSpace {
  public static List<Integer> duplicate(int[] arr){
      List<Integer> l=new ArrayList<>();
      for (int i=0;i<arr.length;i++){
          int index= Math.abs(arr[i])-1;
          if (arr[index]<0){
              l.add(index+1);
          }
          arr[index]=arr[index]*-1;
      }
      return l;
  }
    public static void main(String[] args) {
      int arr[]={1,3,4,2,2};
        System.out.println(duplicate(arr));
    }
}
