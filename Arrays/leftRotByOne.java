import java.util.Arrays;

public class leftRotByOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        answer(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void answer(int[] nums){
        int temp = nums[0];
        int i = 0;
        for(i = 0 ; i < nums.length - 1 ; i++){
            nums[i] = nums[i+1];
        }
        nums[i] = temp;
    }
}
