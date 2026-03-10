public class gridWays {

    public static int gridWays(int i, int j, int n, int m) {

        // reached destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // out of bounds
        if (i == n || j == m) {
            return 0;
        }

        // move down
        int down = gridWays(i + 1, j, n, m);

        // move right
        int right = gridWays(i, j + 1, n, m);

        return down + right;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        System.out.println(gridWays(0, 0, n, m));
    }
}