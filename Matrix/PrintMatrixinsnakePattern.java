package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/print-matrix-in-snake-pattern-1587115621

import java.util.ArrayList;

public class PrintMatrixinsnakePattern {
    public static void main(String[] args) {
        
    }
    //tc is o(n*m)
    //sc is o(n*M)
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ; i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < matrix[0].length ; j++){
                    list.add(matrix[i][j]);
                }
            }else{
                for(int j = matrix[0].length - 1; j >= 0; j--){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
