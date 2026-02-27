public class Factorial {

    public static int findRecur(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * findRecur(n - 1);
        }
    }

    public static void main(String args[]){
        int n = 4;
        System.out.println(findRecur(n));  // 24
    }
}