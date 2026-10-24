import java.util.*;

public class lis {

    // Find LCS of two arrays
    public static int lcs(int arr1[], int arr2[]) {

        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n + 1][m + 1];

        // Bottom-up DP
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (arr1[i - 1] == arr2[j - 1]) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;

                } else {

                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }

        return dp[n][m];
    }

    // Find LIS
    public static int lis(int arr1[]) {

        // Step 1: Remove duplicates
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        // Step 2: Convert HashSet to array
        int arr2[] = new int[set.size()];

        int i = 0;

        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        // Step 3: Sort the array
        Arrays.sort(arr2);

        // Step 4: Find LCS
        return lcs(arr1, arr2);
    }

    public static void main(String args[]) {

        int arr[] = {50, 3, 10, 7, 40, 80};

        System.out.println(lis(arr));
    }
}