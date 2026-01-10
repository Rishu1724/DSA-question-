import java.util.*;
public class largestNumber{
    public static int largevalue(int arr[]){
        int large= integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                larger=arr[i];
            }
           
        }
        return large;
    }

    public static void main(String args[]){
        int arr[]= {23,34,56,768,34,234,456};
        largestNumber(arr);
        System.out.pritnln("the largest value of the array value " +large);

    }

}