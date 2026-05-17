package PracticeArray;

import java.util.HashSet;
import java.util.Set;

public class OneDuplicateUsingSet {

    public static int dup(int arr[]){
      Set<Integer> s= new HashSet<>();
      for (int a:arr){
          if (s.contains(a)){
              return a;
          }
          s.add(a);
      }
      return -1;
    }
    public static void main(String[] args) {
        int arr[] ={0,3,4,0,5};
        System.out.println(dup(arr));
    }
}
