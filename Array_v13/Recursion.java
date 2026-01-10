import java.util.*;

public class Recursion{

    public static int sum(int n){
        if(n== 1)
            return 1;
            return n*(n-1);
        
    }
    // else
    // System.out.println("factorial value of the :" +n);
    
    public static void main(String args[]){
        int n =5;


        System.out.println("this the sum:" + n+ " := "  + sum(n));

    }
}