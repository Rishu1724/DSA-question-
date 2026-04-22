public class lcsub {
    public static int longCs(String strn1, String str2){
        int n = strn1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        int ans = 0;

        // bottom up
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(strn1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(dp[i][j], ans);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        String strn1 = "ABCDE";
        String str2 = "ABGCE";

        System.out.print(longCs(strn1, str2));
    }
}