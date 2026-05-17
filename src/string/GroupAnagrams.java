package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static  String getFrequencyString(String str){
     str=str.toLowerCase();
      int freq[]= new int[26];
      for (char c:str.toCharArray()){
          freq[c-'a']++;
      }
      StringBuilder sb=new StringBuilder();
      char c='a';
      for (int i: freq){
          sb.append(c);
          sb.append(i);
          c++;
      }
      return  sb.toString();
    }

    public static List<List<String>> getGroupAnagrams(String [] str){
        if (str==null || str.length==0){
            return  new ArrayList<>();
        }
        Map<String,List<String>> freqStringMap = new HashMap<>();
        for (String s: str){
            String freqString= getFrequencyString(s);
            if (freqStringMap.containsKey(freqString)){
                freqStringMap.get(freqString).add(s);
            }else {
                ArrayList<String> List= new ArrayList<>();
                List.add(s);
                freqStringMap.put(freqString,List);
            }
        }
        return new ArrayList<>(freqStringMap.values());
    }
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(getGroupAnagrams(strs));
    }
}
