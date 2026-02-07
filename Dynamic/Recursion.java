// package Dynamic;

import java.util.Arrays;

public class Recursion {
    public static int nthFibonacci(int n){
        if(n<=1){
            return n;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);



    }

    // static int nthFiboUtil(int n,int[] dp){
    //     if(n<=1){
    //         return n;
    //     }
    //     if(dp[n])
    // }

   static int[] FunCtion(int m) {
    int[] dp = new int[m];
    Arrays.fill(dp, -2);
    return dp;
}








    public static void main(String args[]){
       int k= nthFibonacci(5);
        System.out.println("the is the fibonaccia series.  " +k);
       


     System.out.println("This is the Fibonacci series: " + FunCtion(5));

        // int r=5;
        // int result = nthFiboUtil(r);
        



    }
}
