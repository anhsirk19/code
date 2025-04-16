
//given an array which may contains duplicates, print all the numbers with their frequency
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class countFrequency {
    public static void main(String[] args) {
        int[] nums = {10,20,20,10,5,10,20,20};
        answer1(nums);
    }
    //using naive approach
    //tc is o(nlogn)
    //sc is o(1)
    static void answer(int[] nums){
        Arrays.sort(nums);
        int prev_ele = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == prev_ele){
                count++;
            }else{
                System.out.println(prev_ele + " -> " + count);
                prev_ele = nums[i];
                count = 1;
            }
            if(i == nums.length-1){
                System.out.println(prev_ele + " -> " + count);
            }
        }
    }
    //using hashMap
    //tc is o(n), sc is o(n)
    static void answer1(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            System.out.println(set.getKey() + " -> " + set.getValue());
        }
    }
}
