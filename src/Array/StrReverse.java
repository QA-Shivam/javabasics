package Array;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StrReverse {
    public static void main(String[] args) {
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        String str="shi2va44m66";
        for (char c:str.toCharArray()){
            if (Character.isDigit(c)){
                int digit=c-'0';
                if (digit<smallest){
                    secondsmallest=digit;
                    smallest=digit;
                } else if (digit<secondsmallest && digit!=smallest) {
                    secondsmallest=digit;
                }
            }
        }
        System.out.println(secondsmallest);
    }

}


