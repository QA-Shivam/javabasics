package Array;

import java.util.*;

public class TopKFrequentExactElementsWithOrdering {

    public static ArrayList<Integer> topKFreq(int[] arr, int k) {

        Map<Integer,Integer> frqmap= new HashMap<>();
        for (int n: arr){
            frqmap.put(n, frqmap.getOrDefault(n,0)+1);
        }

        List<Integer> []b= new List[arr.length+1];
        for (int n: frqmap.keySet()){
            int freqno=frqmap.get(n);
            if (b[freqno]==null){
                b[freqno]= new ArrayList<>();
            }
            b[freqno].add(n);
        }

        ArrayList<Integer> res= new ArrayList<>();
        for(int i= b.length-1;i>=0 && res.size()<k;i--){
            if (b[i]!=null){
                Collections.sort(b[i],Collections.reverseOrder());
                for (int n: b[i]){
                    if (res.size()==k){
                        break;
                    }
                    res.add(n);
                }
            }
        }
        return  res;
    }
    public static void main(String[] args) {
    int arr[]={7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        System.out.println(topKFreq(arr,4));
    }
}
