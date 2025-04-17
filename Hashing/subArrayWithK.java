import java.util.HashMap;
import java.util.HashSet;

//given an array of positive and negative numbers, find if there
//is a subarray(of atleast size one)
//with k sum

public class subArrayWithK {
    public static void main(String[] args) {
        int[] nums = {-1,2,-1,2,4,6};
        System.out.println(answer2(nums, 11));
    }
    //naive approach
    //tc is o(n^2)
    //sc is o(1)
    static boolean answer(int[] nums, int k){
        for(int i = 0 ; i < nums.length ; i++){
            int sum = nums[i];
            if(sum == k){
                return true;
            }
            for(int j = i+1 ; j < nums.length ; j++){
                sum = sum + nums[j];
                if(sum == k){
                    return true;
                }
            }
        }
        return false;
    }
    //using set
    //tc is o(n)
    //sc is o(n)
    static boolean answer1(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            prefixSum += nums[i];
            if(set.contains(prefixSum-k)){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
    //for getting the range, use hashmap
    //tc is o(n)
    //sc is o(n)
    static boolean answer2(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            prefixSum += nums[i];
            if(map.containsKey(prefixSum-k)){
                System.out.println("range from " + (map.get(prefixSum-k) + 1) + " -> " + i);
                return true;
            }
            map.put(prefixSum, i);
        }
        return false;
    }
}
