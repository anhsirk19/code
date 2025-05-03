package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/transpose-of-matrix-1587115621

public class TransposeofMatrix {
    public static void main(String[] args) {
        
    }
    //tc is o(n^2)
    //sc is o(1)
    public void transpose(int n, int mat[][]) {
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
