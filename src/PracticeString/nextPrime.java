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
/* factors hamesha pair mein aate hain. Agar ek factor bada hoga, to uska ek chhota factor bhi hoga.
   Isliye mujhe sirf square root tak check karna hai. Agar square root tak koi factor nahi mila,
   to uske baad bhi nahi milega.

   10 ke factors 2 aur 5 hain. Mujhe 5 check karne ki zarurat nahi hai, kyunki agar 5 factor hai, to
   uska pair 2 bhi hoga. Main 2 ko pehle hi check kar chuka hoon. Isliye square root tak check karna
   enough hota hai.
*/