package PracticeArray;

import java.util.Arrays;

public class findAvg {
    public static void main(String[] args) {
        int arr[]={2,4,5,6};
        double avg=Arrays.stream(arr).mapToDouble(Double::valueOf).average().getAsDouble();
        System.out.println(avg);
    }
}
