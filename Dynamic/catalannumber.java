public class catalannumber {
    public static int catalan(int n ){
        // int c0=1;
        // int c1=1;
        int ans = 0;
        // this is the base case 
        if(n==0 || n==1){
            return 1;
        }
        for(int i =0;i <n; i++){
            ans += catalan(i)* catalan(n-i-1); // <-- this is the last value and the first value 
        }
        return ans;

    }
    public static void main(String[] args) {
        int cat = 5;
        System.out.println(catalan(cat));

    }
}
