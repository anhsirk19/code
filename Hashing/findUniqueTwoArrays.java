
//find the unique elements in the union of both arrays

import java.util.Arrays;
import java.util.HashSet;

public class findUniqueTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {7,1,5,2,3,6};
        int[] arr2 = {3,8,6,20,7};
        System.out.println(answer(arr1, arr2));
        System.out.println(answer1(arr1, arr2));
    }

    //naive approach
    //tc is o(nlogn), n = n1 + n2
    //sc is o(n1 + n2)
    static int answer(int[] arr1, int[] arr2){
        int n = arr1.length + arr2.length;
        int[] nums = new int[n];
        int i = 0;
        for(i = 0 ; i < arr1.length ; i++){
            nums[i] = arr1[i];
        }
        System.out.println(i);
        for(int j = i ; j < n ; j++){
            nums[j] = arr2[j-i];
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        int count = 1;
        int last_element = nums[0];
        for(int k = 1 ; k < nums.length ; k++){
            if(nums[k] != last_element){
                last_element = nums[k];
                count++;
            }
        }
        return count;
    }

    //using set
    //tc is o(n + m)
    //sc is o(n + m)
    static int answer1(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr1){
            set.add(ele);
        }
        for(int ele : arr2){
            set.add(ele);
        }
        return set.size();
    }
}
