package shivam;

public class solution5 {

    public static boolean isPrime( int n){
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return  true;
    }
    public static int nextPrime(int n){
       n=n+1;
       while (!isPrime(n)){
           n=n+1;
       }
       return n;
    }
    public static void main(String[] args) {
        System.out.println(nextPrime(23));
    }
}
