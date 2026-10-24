public class fibonacci {
    public static int fib(int n ){
        if(n <=1  ){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static int fibdp(int n ){
        if(n<=1) return n;
        int[] dp=new int [n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n =10;
        int result =fib(n);
        System.out.println(result);
        int result2= fibdp(n);
        System.out.println(result2);
    }
}
