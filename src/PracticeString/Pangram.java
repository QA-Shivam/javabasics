package PracticeString;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean ispangram(String str){
        Set<Character> s=new HashSet<>();
        char[] c= str.toLowerCase().toCharArray();
        for (char ch:c){
            if (ch>='a' && ch<='z'){
                s.add(ch);
            }
        }
        return s.size()==26;
    }
    public static void main(String[] args) {
        if (ispangram("The quick brown fox  jumps over the lazy dog")) {
            System.out.println(" String is Pangram");
        } else {
            System.out.println("String is not Pangram");
        }
    }
}
