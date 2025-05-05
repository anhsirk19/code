package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/search-in-a-matrix-1587115621

public class SearchinasortedMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.println(searchMatrix(mat, 33));
    }

    //tc is o(m*n)
    //sc is o(1)
    public static boolean searchMatrix(int[][] mat, int x) {
        for (int[] arr : mat) {
            for (int ele : arr) {
                if (ele == x) {
                    return true;
                }
            }
        }
        return false;
    }

    //tc is o(m + n)
    //sc is o(1)
    public static boolean searchMatrix1(int[][] mat, int x) {
        int r = 0;
        int c = mat[0].length-1;
        while(r < mat.length && c >= 0){
            if(x > mat[r][c]){
                r++;
            }else if(x < mat[r][c]){
                c--;
            }else{
                return true;
            }
        }
        return false;
    }
}
