package Backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n =4;

        placeQueen(n);
    }

    private static void placeQueen(int n) {
        int matrix[][] = new int[n][n];
        solve(matrix,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean solve(int[][] matrix, int col) {
        if (col >= matrix.length) {
            return true;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (isSafe(matrix,i,col)){
                matrix[i][col] = 1;
            }
            if (solve(matrix ,col+1) == true){
                return true;
            }
            matrix[i][col] = 0;
        }
    return false;
    }

    private static boolean isSafe(int[][] matrix, int row, int col) {
     int i;
     int j;

        for ( i = 0; i < col; i++) {
            if (matrix[row][i] == 1){
                return false;
            }
        }

        for (i= row ,j =col; i>=0 && j >= 0 ; i--,j-- ) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        for (i= row ,j =col; j>=0 && i< matrix.length; i++,j-- ) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

}
