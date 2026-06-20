package Array;

import java.util.*;

public class tk {


    public static int[] tk(int arr[], int k){
        Map<Integer,Integer> freqmap= new HashMap<>();
        //collect frequency
        for (int n:arr){
            freqmap.put(n,freqmap.getOrDefault(n,0)+1);
        }
        // create bucket size of array
        List<Integer> []bucket= new List[arr.length+1];

        //put numbers into bucket as per frequency
        for (int number : freqmap.keySet()){
            int getfrequency = freqmap.get(number);
            if (bucket[getfrequency]==null){
                bucket[getfrequency]=new ArrayList<>();
            }
            bucket[getfrequency].add(number);
        }
        // create list to store top k elements
        List<Integer> topK= new ArrayList<>();
        // get the top most frequent elements
        for (int i = bucket.length-1;i>=0 && topK.size()<k;i--){
            if (bucket[i]!=null){
              topK.addAll(bucket[i]);
            }
        }
        return topK.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,4,4};
        System.out.println(Arrays.toString(tk(arr,2)));
    }
}
