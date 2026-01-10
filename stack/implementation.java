import java.util.*;

public class implementation {
    private int[] arr;
    private int[] capacity;
    private int top ;

    public implementation( int cap){
        capacity = cap;
        arr = new int [capacity];
        top =-1;

    }
    void push(int x){
        if(top == capacity -1){
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = x;
    }
    
}
