import java.util.*;
 public class maxisubsum{
    public static int Maxsum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int crtsum=0;
            for(int j=i; j<arr.length;j++){
                crtsum+=crtsum+arr[j];
                max =Math.max(max,crtsum);
            }
        }
        return max;

    }
    public static void main(String args[]){
        int arr[]= {4,7,4,3,4,5,7};
        System.out.println(Maxsum(arr));
    }
 }