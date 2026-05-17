package PracticeString;

public class nextPrime {
    public static int np(int n){
        n=n+1;
        while (!isPrime(n)){
            n=n+1;
        }
        return n;
    }

    public static boolean isPrime(int x){
        for (int i=2;i*i<=x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(np(21));
    }
}
