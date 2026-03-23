public class Rotate2Darray {

    // Function to rotate matrix 90 degree clockwise
    public static int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] newMat = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMat[j][n - i - 1] = mat[i][j];
            }
        }

        return newMat;
    }

    // Function to print matrix
    public static void displayMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[][] rotatedMat = rotateMatrix(mat);

        displayMatrix(rotatedMat);
    }
}