//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Arrays/problem/rearrange-an-array-with-o1-extra-space3142

import java.util.Arrays;

public class rearrangeArray {
    public static void main(String[] args){
        int[] arr = {4,0,2,1,3};
        arrange1(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    //tc is o(n),
    //sc is o(n)
    static void arrange(long arr[], int n)
    {
        // your code here
        long[] temp = new long[n];
        for(int i = 0 ; i < n ; i++){
            temp[i] = arr[(int)arr[i]];
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = temp[i];
        }
    }

    //tc is o(n)
    //sc is o(1)
    //Use modulus and division trick to store two numbers in one array index.
    //https://chatgpt.com/c/67ee6bec-5108-8005-95be-934e1c779ade
    static void arrange1(int[] arr, int n){
        for(int i = 0 ; i < n ; i++){
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = arr[i]/n;//to get the new values
        }
    }
}
