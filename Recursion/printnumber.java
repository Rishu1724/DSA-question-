public class printnumber {


    public static int sumOf(int n){
        if(n==1){
            return 1;

        }
        return n+ sumOf(n-1);

    }
    public static void main(String args[]){
        int n=5;
        System.out.println(sumOf(n));



    }
}
