import java.util.*;
//Input: arr[] = [2, 2, 2, 2, 2]
//Output: [2]

public class removedublicate{
    public static int Remove(int arr[]){
    //   ArrayList<Integer> List = new ArrayList<Integer>(arr.length);
    //   for(int i =0; i<List.size(); i++){
        
    //   }
    // }
    int i = arr[0]; 
    int j = arr.length-1;
    while(i<j){
        int temp = arr[i];
         arr[j]= temp;
         

    }


    public static void main(String args[]){
        int arr[]= {2,3,4,5,6,7};

    }
}