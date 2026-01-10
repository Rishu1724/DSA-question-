import java.util.*;
//we are finding the target key 
// which is the sum of the two index in the array

public class TwoPointer{
    public static void Twosum(int rishu[],int target){
        Arrays.sort(rishu);
        System.out.println(Arrays.toString(rishu));
        int n = rishu.length;
        for(int i =0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(rishu[i]+rishu[j]== target){
                     System.out.println("Target found: " + rishu[i] + " + " + rishu[j]);
                     
                }
                
            }
        }
    


    }



    public static void main(String args[]){

        int rishu[] ={34,56,23,45,66};
        int target= 100;
        Twosum(rishu,target);


    }
}