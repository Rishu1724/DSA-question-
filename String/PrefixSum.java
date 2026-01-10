import java.util.ArrayList;

public class PrefixSum{

    // function to find the prefix sum array
    public static ArrayList<Integer> prefSum(int[] arr) {
        int n = arr.length;

        // to store the prefix sum
        ArrayList<Integer> prefixSum = new ArrayList<>();

        // initialize the first element
        prefixSum.add(arr[0]);

        // Adding present element with previous element
        for (int i = 1; i < n; i++)
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);

        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        ArrayList<Integer> prefixSum = prefSum(arr);
        for (int i : prefixSum) {
            System.out.print(i + " ");
            
        }
        System.out.println();
        int ms = Math.max(110,280);
        System.out.print(+ms);
    }
}