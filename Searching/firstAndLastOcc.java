package Searching;

public class firstAndLastOcc {
    public static void main(String[] args) {
        int[] nums = {1,10,10,10,20,20,40};
        int firstOcc = binary_search(nums, true, 10);
        int lastOcc = binary_search(nums, false, 10);
        System.out.println(lastOcc - firstOcc + 1);
    }
    //tc is o(logn)
    //sc is o(1)
    static int binary_search(int[] nums, boolean isFirst, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = high + (low -high)/2;

            if(nums[mid] == target){
                ans = mid;
                if(isFirst){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return ans;
    }
}
