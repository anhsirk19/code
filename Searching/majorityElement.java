package Searching;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Searching/problem/majority-element-1587115620
public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(answer(arr));
    }
    //tc is o(n^2)
    //sc is o(1)
    static int answer(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
     //using hashmap
    //tc is o(n)
    //sc is o(n)
    static int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue() > arr.length/2){
                return set.getKey();
            }
        }
        return -1;
    }
}
