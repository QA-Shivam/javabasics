package string;

public class longestCommonSubsequence {
    public static int longestCommonSubsequence(String s1, String s2){
       /* “I use a dp table of size (m+1) × (n+1) so that dp[0][] and dp[][0] naturally represent empty
        string base cases. This avoids boundary checks and simplifies transitions.”
        */
        int [][] dp= new int[s1.length()+1][s2.length()+1];
        for (int i=1;i<=s1.length();i++){
            for (int j=1;j<=s2.length();j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    // Take diagonal value and add 1
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        int ans = longestCommonSubsequence("a", "abdc");
        System.out.println(ans);
    }
}
