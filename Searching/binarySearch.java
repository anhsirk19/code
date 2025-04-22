package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binary_search(arr, 8));
        System.out.println(binary_search1(arr, 0, arr.length -1 , 8));
    }
    //the array should be sorted, iterative approach
    //tc is o(logn)
    //sc is o(1)
    static int binary_search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = high + (low-high)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    //recursive approach
    static int binary_search1(int[] arr, int low, int high, int target){
        //base case
        //this means no target found
        if(low > high){
            return -1;
        }
        int mid = high + (low-high)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            return binary_search1(arr, mid+1, high, target);
        }else{
            return binary_search1(arr, low, mid-1, target);
        }
    }
}
