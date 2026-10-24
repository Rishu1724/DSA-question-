// package Dynamic;
public class Knapsack {
    // public static int kanpSack(int val[], int wt[], int w, int n) {
    //     if (w == 0 || n == 0) {
    //         return 0;
    //     }
    //     if (wt[n - 1] <= w) { // iteam ka index wo kaha hai
    //         int ans1 = val[n - 1] + kanpSack(val, wt, w - wt[n - 1], n - 1);// valid condition 
    //         int ans2 = kanpSack(val, wt, w, n - 1);// invalid condition 

    //         return Math.max(ans1, ans2);
    //     } else {
    //         return kanpSack(val, wt, w, n - 1);// when wt is more 
    //     }
    // }
    public static int Tabkanp(int val[],int[] wt, int W){
        int n =val.length;
        int dp[][]= new int[n+1][W+1];
        // initilaze
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        // tab loop
        for(int i =1;i<n+1;i++){
            for(int j=1; j<W+1; j++){
                //valib 
                int v= val[i-1];
                int w= wt[i-1];
                if(w<=j){// valid condtion 
                    int inc = v+ dp[i-1][j-w];
                    int exc= dp[i-1][j];
                    dp[i][j] = Math.max(inc,exc);
                }
                else{// invalid
                    dp[i][j]= dp[i-1][j];

                }
            }
        }
        return dp[n][W];

    }
    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };// value 
        int wt[] = { 2, 5, 1, 3, 4 }; // weight 
        int W = 7;// capacity 
        int n = val.length;
        System.out.println(Tabkanp(val, wt, W));
    }
}