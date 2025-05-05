package Matrix;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/make-matrix-beautiful-1587115620

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        
    }

    //tc is o(m*m)
    //sc is o(2m)
    
    public static int findMinOperation(int[][] mat) {
        int m = mat.length;
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        for(int i = 0 ; i < m ; i++){
            int sum = 0;
            for(int j = 0 ; j < m ; j++){
                sum = sum + mat[i][j];
            }
            arr1[i] = sum;
        }
        for(int i = 0 ; i < m ; i++){
            int sum = 0;
            for(int j = 0 ; j < m ; j++){
                sum = sum + mat[j][i];
            }
            arr2[i] = sum;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < m ; i++){
            max = Math.max(max, arr1[i]);
        }
        for(int i = 0 ; i < m ; i++){
            max = Math.max(max, arr2[i]);
        }
        int ans = 0;
        for(int ele : arr1){
            ans = ans + max - ele;
        }
        return ans;
    }
}
