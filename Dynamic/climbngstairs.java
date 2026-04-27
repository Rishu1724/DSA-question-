public class climbngstairs {
    public static int stairs(int n){
        int[] dp= new int[n+1];
        return helper(n,dp);// helper function call 


    }
    public static int helper(int n , int dp){
        if(n==0){
            return 1;

        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return helper(n-1, dp)+ helper(n-2,dp);// this is the helper function 
        // add this also 

    }

    public static void main(String[] args) {
        int number = 5;
    }
}
