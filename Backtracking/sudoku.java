public class sudoku {
    public static boolean sudokuSolver(int sudoku[][] , int now , int col){
        // base case


        // recursion 

        int nextRow = new , nextCOl =col+1;
        if(col+1 ==9){
            nextRow = row+1;
            nextCol =0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow,nextCol);
        }
        for(int digit =1; digit<=9; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
            }
        }
    }
    public static void mai(String args[]){

    }
}
