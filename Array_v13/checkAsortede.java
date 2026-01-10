import java.util.*;

// public class checkAsortede{

//     public static boolean isSort(int arr[], int i){
//         if(i== arr.length){
//          return true;
//         }
//         if(arr[i]> arr[i+1]){
//             return false;
//         }
//         return isSort(arr, i+1);
    
//     }


//     public static void main(String args[]){
//         int arr[]= {23,45,56,67,87};
//        boolean result= isSort(arr,0);
//        System.out.println("this is the sortede array" +result);

//     }
// }


public class checkAsortede {
    public static boolean isSort(int arr[], int i) {

        // Stop at last index
        if (i == arr.length - 1) {
            return true;
        }

        // Compare current and next
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call
        return isSort(arr, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = {23, 45, 56, 67, 87, 345};

        boolean result = isSort(arr, 0);
        System.out.println("Is array sorted? " + result);
    }
}
