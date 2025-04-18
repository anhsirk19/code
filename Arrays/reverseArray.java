import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
