package Array;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StrReverse {

    public static boolean isprime(int n){
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int nextprime(int n){
        n=n+1;
        while (!isprime(n)){
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(nextprime(27));
    }

}


