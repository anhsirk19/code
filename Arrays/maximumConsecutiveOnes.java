public class maximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1,1,0,1,1};
        System.out.println(answer(nums));
    }

    static int answer(int[] nums){
        int count = 0;
        int countMax = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                countMax = Math.max(countMax, count);
            }else{
                count = 0;
            }
        }
        return countMax;
    }
}
