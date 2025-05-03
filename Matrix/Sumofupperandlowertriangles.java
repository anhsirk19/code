package Matrix;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/sum-of-upper-and-lower-triangles-1587115621

public class Sumofupperandlowertriangles {
    public static void main(String[] args) {
        
    }
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                sum1+= matrix[i][j];
            }
            for(int j = i ; j >= 0 ; j--){
                sum2 += matrix[i][j];
            }
        }
        list.add(sum1);
        list.add(sum2);
        return list;
    }
}
