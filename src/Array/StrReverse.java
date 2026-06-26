package Array;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StrReverse {
    public static void main(String[] args) {
        int largest=-1;
        int secondlargest=-1;
        String str="shi2va4m66";
        for (char c: str.toCharArray()){
            if (Character.isDigit(c)){
                int digit=c-'0';
                if (digit>largest){
                    secondlargest=largest;
                    largest=digit;
                } else if (digit>secondlargest  && digit!=largest) {
                    secondlargest=digit;
                }
            }
        }
        System.out.println(secondlargest);
    }

}


