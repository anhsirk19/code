package Recursion;

public class tappingRainWater {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(maxWater1(arr));
    }

    //tc is o(n^2)
    //sc is o(n)
    static int maxWater(int arr[]) {
        int res = 0;

        for(int i = 1 ; i < arr.length - 1 ; i++){
            int lmax = arr[i];
            for(int j = 0 ; j < i ; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for(int j = i+1 ; j < arr.length ; j++){
                rmax = Math.max(rmax, arr[j]);
            }
            res = res + Math.min(lmax, rmax) - arr[i];
        }

        return res;
    }

    //tc is o(n)
    //sc is o(n)
    static int maxWater1(int arr[]) {
        int n = arr.length;
        
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for(int i = 1 ; i < n ; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        for(int j = n-2 ; j >= 0 ; j--){
            rmax[j] = Math.max(arr[j], rmax[j+1]);
        }
        int res = 0;
        
        for(int i = 1 ; i < n-1 ; i++){
            res = res + Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return res;
    }
    //using two pointer approach
    //tc is o(n)
    //sc is o(1)
    static int maxWater2(int arr[]){
        int n = arr.length;
        int res = 0;
        int lmax = 0, rmax = 0;
        int i = 0, j = n-1;
        
        while(i <= j){
            if(arr[i] <= arr[j]){
                if(arr[i] > lmax){
                    lmax = arr[i];
                }else{
                    res = res + lmax - arr[i];
                }
                i++;
            }else{
                if(arr[j] > rmax){
                    rmax = arr[j];
                }else{
                    res = res + rmax - arr[j];
                }
                j--;
            }
        }
        return res;
    }
}
