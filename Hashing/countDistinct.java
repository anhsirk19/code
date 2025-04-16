import java.util.Arrays;
import java.util.HashSet;

public class countDistinct {
    public static void main(String[] args) {
        int[] nums = {10, 20, 20, 10, 30, 10};
        System.out.println(answer(nums));
    }
    //brute force approach
    //tc is o(n^2)
    static int answer(int[] nums){
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            int j = 0;
            for(j = 0 ; j < i ; j++){
                if(nums[j] == nums[i]){
                    break;
                }
            }
            if(i == j){
                count++;
            }
        }
        return count;
    }


    //better approch
    //tc is o(nlogn)
    static int answer1(int[] nums){
        Arrays.sort(nums);
        int count = 1;
        int last_element = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != last_element){
                last_element = nums[i];
                count++;
            }
        }
        return count;
    }

    //using hashset
    //tc is o(n)
    //sc is o(n)
    static int answer2(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        return set.size();
    }
}
