package Matrix;

import java.util.Arrays;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/multiply-the-matrices-1587115620

public class MultiplicationOfMatrixes {
    public static void main(String[] args) {
        
    }

    //TC = O(4*4)
    //SC is o(4*4)
    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        // code here
        int[][] ans = new int[4][4];
        for(int i = 0 ;i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                ans[i][j] = 0;
                for(int k = 0 ; k < 4; k++){
                    ans[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        return Arrays.deepEquals(ans, result);
    }
}
