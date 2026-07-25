package shivam;

import java.util.*;

public class solution17 {
    public static ArrayList<Integer> topkFrequent(int arr[], int k){
        Map<Integer,Integer> freqmap= new HashMap<>();
        List<Integer> [] bucket= new List[arr.length+1];
        ArrayList<Integer> result= new ArrayList<>();
        for (int n:arr){
            freqmap.put(n,freqmap.getOrDefault(n,0)+1);
        }

        for (int n: freqmap.keySet()){
            int freqno=freqmap.get(n);
            if (bucket[freqno]==null){
                bucket[freqno]= new ArrayList<>();
            }
            bucket[freqno].add(n);
        }

        for (int i=bucket.length-1;i>=0 && result.size()<k;i--){
            if (bucket[i]!=null){
                for (int n: bucket[i]){
                    if (result.size()==k){
                        break;
                    }
                    result.add(n);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={7, 10, 11, 5, 2, 5, 5};
        System.out.println(topkFrequent(arr,2));
    }
}
