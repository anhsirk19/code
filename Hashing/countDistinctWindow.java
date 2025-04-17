
//given an array of size n and an inteer k, return the count of
//distinct numbers in all windows of size k.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class countDistinctWindow {
    public static void main(String[] args) {
        int[] nums = {1,2,4,4};
        ArrayList<Integer> ans = answer2(nums, 2);
        System.out.println(ans);
    }

    //naive approach
    //tc is O((n − k+1) × klogk), O(nklogk)
    //sc is O(k+n)≈O(n)
    static ArrayList<Integer> answer(int[] nums, int k){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length-k+1; i = i + 1){
            int[] newArray = new int[k];

            for(int j = 0 ; j < k ; j++){
                newArray[j] = nums[j+i];
            }

            Arrays.sort(newArray);
            int count = 1;
            int last_element = newArray[0];
            for(int z = 1 ; z < k; z++){
                if(newArray[z] != last_element){
                    last_element = newArray[z];
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }

    //better approach
    //tc is O(nk)
    //sc is o(n + k)
    static ArrayList<Integer> answer1(int[] nums, int k){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length-k+1; i = i + 1){
            int[] newArray = new int[k];

            for(int j = 0 ; j < k ; j++){
                newArray[j] = nums[j+i];
            }

            HashSet<Integer> set = new HashSet<>();
            for(int z = 0 ; z < k ; z++){
                set.add(newArray[z]);
            }
            list.add(set.size());
        }
        return list;
    }

    //optimal approach
    //using sliding window and hashmap
    //tc is o(n)
    //sc is o(k), without considering arraylist space
    
    static ArrayList<Integer> answer2(int[] nums, int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < k ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        list.add(map.size());
        for(int i = k ; i < nums.length ; i++){
            int first_ele_window = i-k;//to remove first ele in previous window

            //decrease by 1 if nums[i-k] is already present
            map.put(nums[first_ele_window], map.get(nums[first_ele_window]) - 1);
            //remove it from map if its value is zero
            if(map.get(nums[first_ele_window]) == 0){
                map.remove(nums[first_ele_window]);
            }
            //add nums[i]
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            list.add(map.size());
        }
        return list;
    }
}
