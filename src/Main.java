import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
public static int[] topkFrequent(int ar[], int k){
    Map<Integer,Integer>map= new HashMap<>();
    for (int n:ar){
        map.put(n,map.getOrDefault(n,0)+1);
    }
    List<Integer>[] bucket= new List[ar.length+1];
    for (int number:map.keySet()){
        int freq=map.get(number);
        if (bucket[freq] == null){
            bucket[freq]=new ArrayList<>();
        }
        bucket[freq].add(number);
    }
    List<Integer>topK= new ArrayList<>();
    for (int position=bucket.length-1;position>=0 && topK.size()<k;position--){
        if (bucket[position]!=null){
            for (int n:bucket[position]){
                if (topK.size()==k){
                    break;
                }
                topK.add(n);
            }
        }
    }

    return topK.stream().mapToInt(x->x).toArray();

}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,1};
        System.out.println(Arrays.toString(topkFrequent(arr,3)));
    }
}