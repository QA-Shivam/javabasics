package shivam;

public class solution9 {

    public static int revInt(int n){
        int rev=0;
        while (n>0){
            int lastdigit=n%10;
            if (rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(revInt(n));
    }
}
