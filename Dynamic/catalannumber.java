public class catalannumber {
    public static int catalan(int n ){
        // int c0=1;
        // int c1=1;
        int ans = 0;
        if(n==0 || n==1){
            return 1;
        }
        for(int i =0;i <n-1; i++){
            ans += catalan(i)* catalan(n-i-1);
        }
        return ans;

    }
    public static void main(String[] args) {
        int cat = 5;
        System.out.println(catalan(cat));

    }
}
