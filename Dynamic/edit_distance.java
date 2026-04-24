public class edit_distance {

    public static int editdist(String st1, String st2){
        int n = st1.length();
        int m = st2.length();
        int dp[][] =new int[n+1][m+1];

        // initialize the dp 
        for(int i=0 ; i<n+1; i++){
            for(int j=0;j<m+1; j++){
                if(i==0){
                    dp[i][j]=j;

                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }


        // now tabulation code

        for(int i=1;i<n+1;i++){
            for(int j=1; j<m+1; j++){
                if(st1.charAt(i-1)==st2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];// same
                }
                else{
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j]+1;
                    int rep= dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add,Math.min(del,rep));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]){
        String str1 = "abc";
        String str2 = "sbdgggh";
        System.out.print(editdist(str1,str2));
    }
}
