package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/reversing-the-rows-of-a-matrix-1587115621

public class nterchangingtherowsofaMatrix {
    public static void main(String[] args) {
        
    }

    // Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][]) {
        int r1 = 0;
        int r2 = matrix.length - 1;
        while(r1 < r2){
            for(int i = 0 ; i < matrix[0].length ; i++){
                int temp = matrix[r1][i];
                matrix[r1][i] = matrix[r2][i];
                matrix[r2][i] = temp;
            }
            r1++;
            r2--;
        }
        
    }
}
