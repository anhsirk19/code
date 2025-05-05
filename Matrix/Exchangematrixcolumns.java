package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/exchange-matrix-columns-1587115620

public class Exchangematrixcolumns {
    public static void main(String[] args) {
        
    }
    // Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][]) {
        // code here
        int c1 = 0;
        int c2 = matrix[0].length-1;
        for(int i = 0 ; i < matrix.length ; i++){
            int temp = matrix[i][c1];
            matrix[i][c1] = matrix[i][c2];
            matrix[i][c2] = temp;
        }
    }
}
