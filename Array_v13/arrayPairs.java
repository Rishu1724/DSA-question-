import java.util.*;

public class arrayPairs{
    public static void printParis(int arr17[]){
        for(int i =0; i<arr17.length;i++){
            int current= arr17[i];

            for(int j=i+1; j<arr17.length;j++){
               System.out.println(current + ", " + arr17[j]);
               int sum = arr17[i]+arr17[j];
               

            }
            System.out.println(sum+);
        }

    }
    

    public static void main(String args[]){

        int arr17[]= {2,4,6,8,10};
        printParis(arr17);

    }
}