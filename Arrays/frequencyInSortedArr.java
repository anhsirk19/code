public class frequencyInSortedArr {
    public static void main(String[] args) {
        int[] nums = {10, 20,20,20, 30, 40, 50, 50, 60};
        solution(nums);
    }
    //tc is o(n)
    //sc is o(1)
    static void solution(int[] nums){
        int count = 1;
        int prev_ele = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == prev_ele){
                count++;
            }else{
                System.out.println(prev_ele + " -> " + count);
                prev_ele = nums[i];
                count = 1;
            }
        }
        System.out.println(prev_ele + " -> " + count);
    }
}
