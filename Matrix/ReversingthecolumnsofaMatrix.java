package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/reversing-the-columns-of-a-matrix-1587115621

public class ReversingthecolumnsofaMatrix {
    // Function to reverse the columns of a matrix.
    //tc is o(m*n)
    static void reverseCol(int matrix[][]) {
        // code here
        int c1 = 0;
        int c2 = matrix[0].length - 1;
        while(c1 < c2){
            for(int i = 0 ; i < matrix.length ; i++){
                int temp = matrix[i][c1];
                matrix[i][c1] = matrix[i][c2];
                matrix[i][c2] = temp;
            }
            c1++;
            c2--;
        }
    }
}
