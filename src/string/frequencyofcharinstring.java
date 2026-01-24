package string;

import java.util.HashMap;

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
        charfreq("Automation");
    }
}