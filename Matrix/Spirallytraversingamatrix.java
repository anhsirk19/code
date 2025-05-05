package Matrix;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Matrix/problem/spirally-traversing-a-matrix-1587115621

public class Spirallytraversingamatrix {
    public static void main(String[] args) {
        int a[][] =  {{1, 2, 3, 4},
                   {5, 6, 7, 8},
                   {9, 10, 11, 12},
                   {13, 14, 15, 16}};
        ArrayList<Integer> ans = spirallyTraverse(a);
        System.out.println(ans);
    }
    //tc is o(m*n)
    //sc is o(1)
    public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int r = 0, rEnd = mat.length - 1;
        int c = 0, cEnd = mat[0].length - 1;
        while(r <= rEnd && c <= cEnd){
            for(int i = c ; i <= cEnd ; i++){
                list.add(mat[r][i]);
            }
            r++;
            for(int i = r ; i <= rEnd ; i++){
                list.add(mat[i][cEnd]);
            }
            cEnd--;
            if(r <= rEnd){
                for(int i = cEnd ; i>= c ; i--){
                    list.add(mat[rEnd][i]);
                }
                rEnd--;
            }
            if(c <= cEnd){
                for(int i = rEnd ; i>= r ; i--){
                    list.add(mat[i][c]);
                }
                c++;
            }
        }
        return list;
    }
}
