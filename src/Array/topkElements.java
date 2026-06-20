package Array;

import java.lang.management.ManagementPermission;
import java.util.*;

public class topkElements {
    public static int[] topkElements(int[] num,int k){
        // Step 1: Count frequency of each number
        Map<Integer,Integer> countfreq= new HashMap<>();

        // Step 2: Create buckets where index = frequency
        // bucket[3] will store all numbers appearing 3 times
        List<Integer>[] bucket = new List[num.length+1];
        for (int i:num){
            countfreq.put(i,countfreq.getOrDefault(i,0)+1);
        }

        //Put Numbers Into Buckets
        for (int number :countfreq.keySet()) {
            int getfrequency = countfreq.get(number);
            if (bucket[getfrequency] == null) {
//              create a new list to store numbers having that frequency
                bucket[getfrequency] = new ArrayList<>();
            }
            bucket[getfrequency].add(number);
        }

        // Collect top k frequent elements
       // Keep moving through buckets AND Stop immediately once k elements are collected
            List<Integer> topK = new ArrayList<>();
            for (int position=bucket.length-1;position>=0 && topK.size()<k; position--){
                if (bucket[position]!=null){
                    topK.addAll(bucket[position]);
                }
            }
            return topK.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        System.out.println(Arrays.toString(topkElements(arr,2)));

    }
}


/*
First I count frequencies using a HashMap.

Then I observe that frequency can never exceed array length.

I create buckets where index represents frequency.

Each bucket stores numbers having that frequency.

Finally I traverse buckets from highest frequency to lowest and collect k elements.
*/

