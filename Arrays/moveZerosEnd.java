import java.util.Arrays;

//The problem is to move all the 0’s to the end of the array

public class moveZerosEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        answer(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void answer(int[] nums){
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        for(int i = count ; i < nums.length ; i++){
            nums[i] = 0;
        }
    }
}
