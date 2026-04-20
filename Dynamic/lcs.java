public class lcs {
    public static int longestcs(String str1, String str2, int n , int m){
        // base case
        if(m==0 || n==0){
            return 0;
        }
        if(str1.charAt(n-1)== str2.charAt(m-1)){
            return longestcs(str1, str2,n-1,m-1)+1;
        }
        else{
            int ans1 = longestcs(str1, str2,n-1,m);
            int ans2 = longestcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }
    public static void main(String[] args){
        String str1 = "abcdge";
        String str2 = "abedg";// ans will be 4;
        System.out.println(longestcs(str1,str2,str1.length(),str2.length()));
    }
}
