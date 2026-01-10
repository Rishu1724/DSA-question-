import java.util.*;

public class largeele{

    public static void Large(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }

        }
           System.out.println(max);
    }

    public static void main(String args[]){
        int arr[]={3,4,5,6,7,2,5,7};
        Large(arr);

    }
}