package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/adding-two-matrices3512

public class AdditionOfMatrixes {
    public static void main(String[] args) {
        
    }

    //TC = O(n × m)
    //SC = o(1)
    // Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][]) {
        int rows1 = A.length;
        int cols1 = A[0].length;
        int rows2 = B.length;
        int cols2 = B[0].length;
        if(rows1 != rows2 || cols1 != cols2){
            return new int[0][0];
        }
        for(int i = 0 ; i < rows1 ; i++){
            for(int j = 0 ; j < cols1 ; j++){
                A[i][j] = A[i][j] + B[i][j];
            }
        }
        return A;
    }
}
