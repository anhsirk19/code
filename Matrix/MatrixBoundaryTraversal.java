package Matrix;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/boundary-traversal-of-matrix-1587115620

public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
        
    }

    // Function to return list of integers that form the boundary
    // traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        
        for(int i = 0 ; i < n ; i++){
            list.add(mat[0][i]);
        }
        for(int i = 1 ; i < m ; i++){
            list.add(mat[i][n-1]);
        }
        for(int i = n-2 ; i>= 0 ; i--){
            list.add(mat[m-1][i]);
        }
        for(int i = m-2; i > 0 ; i--){
            list.add(mat[i][0]);
        }
        return list;
    }
}
