public class knapsackmemo {
    public static int Knapmomo(int val[], int wt[],int w,int n,int[][] dp){
        if(w==0 || n==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){// valid condition 
            // include
            int ans1=val[n-1]+Knapmomo(val,wt,w-wt[n-1],n-1,dp);
            //exclude
            int ans2 = Knapmomo(val,wt,w,n-1,dp);
           dp[n][w]= Math.max(ans1,ans2);
            return dp[n][w];

        }
        else{
            dp[n][w]=Knapmomo(val,wt,w,n-1,dp);
        }

    }
    public static void main(String args[]){
        int [] val={15,14,10,45,30};
        int [] wt={2,5,3,4,5};
        int w=7;
        int n=val.length; 
        int [][] dp= new int[n+1][w+1];
    }
}
