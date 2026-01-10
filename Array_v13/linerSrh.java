import java.util.*;
public class linerSrh{
    public static int linersearch(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;  // return the index
            }
        }
        return -1; // key not found
    }

    public static void main(String args[]){
        int number[] = {12,34,56,34,23,45};
        int key = 88;
        int ans = linersearch(number, key);
        System.out.println("The key is found at index: " + ans);
    }
}
