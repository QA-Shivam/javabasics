package string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class frequencyofcharinstring{
    public static void charfreq(String str){
        char [] arr= str.toCharArray();
        HashMap<Character,Integer> freqmap=new HashMap<>();
        for (char chararr: arr){
            freqmap.put(chararr,freqmap.getOrDefault(chararr,0)+1);
        }
        for (char c: freqmap.keySet()){
            System.out.println(c+" => "+ freqmap.get(c));
        }
    }
    public static void main(String[] args) {
        charfreq("Autom%$ation");
        String str="Automation";
        Map<Character,Long> resulr=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(resulr);
    }
}