package Searching;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Searching/problem/floor-in-a-sorted-array-1587115620

public class floorInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(findFloor(nums, 0));
    }
    //tc is o(logn)
    //sc is o(1)
    //similarly for ceil we will return low
    static int findFloor(int[] arr, int x) {
        // write code here
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        boolean isTarget = false;
        while(low <= high){
            int mid = high + (low - high)/2;
            if(arr[mid] == x){
                isTarget = true;
                ans = mid;
                low = mid + 1;
            }else if (x > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return isTarget ? ans : high;
    }
}
