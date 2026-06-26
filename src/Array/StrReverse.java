package Array;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StrReverse {

    public static int revint(int no){
        int rev=0;
        while (no>0){
            int lastdigit=no%10;

            if (rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev=(rev*10)+lastdigit;
            no=no/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(revint(123));
    }

}


