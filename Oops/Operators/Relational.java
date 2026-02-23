// package Operators;

public class Relational {
    class CarInfo{
        String name;
        int model;
        int year;
        
        // CarInfo(String)
    }
public static void ternary(int a,int b){
    String val = (a>b)?"hello" : "baby";
    System.out.println(val);
}


    public static void main(String args[]){
        System.out.println("this is the Relational operator");
        int a=2;
        int b=5;
        int c = a+b;
        ternary(a,b);
         System.out.println(c);


    }
}
