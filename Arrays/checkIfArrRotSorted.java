//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Arrays/problem/check-if-array-is-sorted-and-rotated-clockwise-1587115620
//Given an array arr[] of N distinct integers, check if this array is Sorted
// (non-increasing or non-decreasing) and Rotated counter-clockwise. 

public class checkIfArrRotSorted{
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        System.out.println(checkRotatedAndSorted(arr, 4));
    }

    public static boolean checkRotatedAndSorted(int arr[], int num){
        int inc = 0, dec = 0;
        for(int i = 0 ; i < num ; i++){
            if(arr[i] > arr[(i+1) % num]){
                inc++;
            }
            if(arr[i] < arr[(i+1) % num]){
                dec++;
            }
        }
        return (inc <= 1 || dec <= 1);
    }
    
}