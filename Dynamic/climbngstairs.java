// import java.util.Arrays;

// public class climbngstairs {



//     public static int stairs(int n, int[] ways){
//         // int[] dp= new int[n+1];
//         if(n==0){
//             return 1;

//         }
//         if(n<=0){
//             return 0;
//         }
//         if(ways[n] != -1){
//             return ways[n];

//         }
//         ways[n] = stairs(n-1,ways) + stairs(n-2,ways);
//         return ways[n];


//     }
//     // public static int helper(int n , int dp){
//     //     if(n==0){
//     //         return 1;

//     //     }
//     //     if(n<0){
//     //         return 0;
//     //     }
//     //     if(dp[n]!=0){
//     //         return dp[n];
//     //     }
//     //     return helper(n-1, dp)+ helper(n-2,dp);// this is the helper function 
//     //     // add this also 

//     // }
//     // public static int Climrec(int n ){
//     //     if(n==0){
//     //         return 1;
//     //     }
//     //     if(n<0){
//     //         return 0;
//     //     }
//     //     return Climrec(n-1) + Climrec(n-2);
//     // }

//     public static void main(String[] args) {
//         int n=5;
//         int ways[] = new int[n+1];
//         Arrays.fill(ways,-1);
//         // int number = 5;
//         System.out.println(stairs(n,ways));
//     }
// }


// practice code 
