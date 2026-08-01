package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RomanToInteger {
    public static int romanToInteger(String s){
        Map<Character,Integer> hashMap= new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
         int result= hashMap.get(s.charAt(s.length()-1));
         for (int i =s.length()-2;i>=0;i--){
             if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i+1))){
                 result= result-hashMap.get(s.charAt(i));
             }else {
                 result=result+hashMap.get(s.charAt(i));
             }
         }
         return result;
    }
    public static void main(String[] args) {
       String Input= "IXI";
        System.out.println(romanToInteger(Input));
    }
}
