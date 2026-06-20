package PracticeString;

import java.util.HashMap;
import java.util.Map;

public class printDuplicates {
    public static void printDuplicate(String str){


        Map<Character,Integer> freqmap= new HashMap<>();
        for (char c: str.toCharArray()){
            freqmap.put(c,freqmap.getOrDefault(c,0)+1);
        }
        for (char c:freqmap.keySet()){
            if (freqmap.get(c)>1){
                System.out.println(c+":"+freqmap.get(c));
            }
        }
    }

    public static void main(String[] args) {
        printDuplicate("Shibama");
    }
}
