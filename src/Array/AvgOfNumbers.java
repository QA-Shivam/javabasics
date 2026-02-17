package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static double AvgOfNo(List<Integer> list){
        return list.stream().mapToDouble(e->e).average().getAsDouble();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,56,9,19);
        System.out.println("Average is: "+AvgOfNo(list));
    }
}
