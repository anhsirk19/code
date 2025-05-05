package Matrix;

import java.util.Arrays;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/article/NzY2Ng%3D%3D

public class MedianofaRowWiseSortedMatrix {
    public static void main(String[] args) {
        int m[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
        System.out.println(solution(m));
    }

    //tc is o((m*n)(logm*n))
    //sc is o(m*n)
    public static int solution(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        int k = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                ans[k++] = mat[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k/2];
    }

    //tc is o(m * log(max - min) * logn)
    //sc is o(1)
    public static int solution1(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < m ; i++){
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][n-1]);
        }

        int medPos = (m*n + 1)/2;

        while(min < max){
            int mid = (min + max)/2;
            int midPos = 0;
            for(int i = 0 ; i < m ; i++){
                int p = Arrays.binarySearch(mat[i], mid) + 1;
                midPos += Math.abs(p);
            }
            if(midPos < medPos){
                min = mid + 1;
            }else{
                max = mid;
            }
        }
        return min;
    }
}
