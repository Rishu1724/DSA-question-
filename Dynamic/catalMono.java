public class catalMono {
    public static int cat(int n ){
        int dp[]= new int[n+1];
        int ans =0;
        // base case 
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        // main recur + mono function 
        for(int i=0; i<n; i++){
            ans+= cat(i)*cat(n-i-1);
        }
        return dp[n]=ans;
        
    }
    public static void main(String[] args) {
        int n=4;

    }
}
