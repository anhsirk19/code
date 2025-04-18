//left rotate the array by d places

import java.util.Arrays;

public class leftRotByD {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        solution(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    //tc is o(n)
    //sc is o(1)
    //reversal algorithm
    static void solution(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
