package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/rotate-by-90-degree-1587115621

public class Rotateby90degree {
    public static void main(String[] args) {
        int[][] mat =  { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };

        //display the matrix
        display(mat);
        rotateby901(mat);
        display(mat);

    }
    // Function to rotate matrix anticlockwise by 90 degrees.
    //tc is o(n*n)
    //sc is o(n*n)

    static void rotateby90(int mat[][]) {
        int n = mat.length;
        int[][] temp = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                temp[i][j] = mat[j][n-i-1];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = temp[i][j];
            }
        }
    }

    //first transpose the matrix then reverse the cols
    //tc is o(n*n)
    //sc is o(1)
    static void rotateby901(int mat[][]) {
        int n = mat.length;

        //transpose
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //reverse the rows
        for(int i = 0 ; i < n ; i++){
            int low = 0;
            int high = n-1;
            while(low < high){
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
    }

    static void display(int[][] mat){
        for(int i = 0 ;i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
