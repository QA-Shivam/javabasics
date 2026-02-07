package string;

public class findNextPrime {
public static int nextPrime(int num){
    num=num+1;
    while (!isPrime(num)){
        num=num+1;
    }
    return  num;
}

public static boolean isPrime(int n){
    for (int i=2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        System.out.println("The Next Prime Number is- "+nextPrime(12));

    }
}
