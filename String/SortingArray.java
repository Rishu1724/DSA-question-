import java.util.*;

public class SortingArray {

    public static ArrayList<Integer> SortingA(int arr[]) {
        ArrayList<Integer> sort = new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        // Add sorted values to ArrayList
        for (int num : arr) {
            sort.add(num);
        }

        return sort; // return the ArrayList
    }

    public static void main(String args[]) {
        int arr[] = {12, 354, 7678, 434, 6778, 43232, 8784, 6743, 23, 57};

        ArrayList<Integer> sortedList = SortingA(arr);

        System.out.println("Sorted ArrayList: " + sortedList);
    }
}
