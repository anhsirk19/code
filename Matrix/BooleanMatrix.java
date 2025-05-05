package Matrix;

public class BooleanMatrix {
    public static void main(String[] args) {
        
    }

    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.

    //tc is o(n*m)
    //sc is o(m + n);
    
    void booleanMatrix(int mat[][]) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        boolean[] rowVisited = new boolean[m];
        boolean[] colVisited = new boolean[n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 1){
                    rowVisited[i] = true;
                    colVisited[j] = true;
                }
            }
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(rowVisited[i] || colVisited[j]){
                    mat[i][j] = 1;
                }
            }
        }
        
    }
}
