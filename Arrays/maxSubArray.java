public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(arr));
    }
    //brute 
    //tc is o(n^3)

    //better approach
    //tc is o(n^2)
    static int answer(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = arr[i];
            max_sum = Math.max(sum, max_sum);
            for(int j = i+1 ; j < arr.length ; j++){
                sum = sum + arr[j];
                max_sum = Math.max(sum, max_sum);
            }
        }
        return max_sum;
    }

    //optimised approach
    //kadanes algorithm
    //tc is o(n), ac is o(1)
    static int answer2(int[] arr){
        // int sum = 0;
        // int max_sum = Integer.MIN_VALUE;
        // for(int i = 0 ; i < arr.length ; i++){
        //     sum += arr[i];
        //     max_sum = Math.max(sum, max_sum);
        //     if(sum < 0){
        //         sum = 0;
        //     }
        // }
        int curr_sum = arr[0];
        int max_so_far = arr[0];
        for(int i = 1; i < arr.length ; i++){
            curr_sum = Math.max(curr_sum + arr[i], arr[i]);
            max_so_far = Math.max(curr_sum, max_so_far);
        }
        return max_so_far;
    }

    //to print the range also
    static int maxSubarraySum(int[] arr) {
        int curr_sum = arr[0];
        int max_sum = arr[0];
        int start = 0;
        int end = 0;
        int fStart = 0;
        int fEnd = 0;
        
        for(int i = 1; i < arr.length ; i++){
            if(curr_sum + arr[i] > arr[i]){
                curr_sum = curr_sum + arr[i];
                end = i;
            }else{
                curr_sum = arr[i];
                start = i;
            }
            if(max_sum < curr_sum){
                fStart = start;
                fEnd = end;
                max_sum = curr_sum;
            }
        }
        System.out.println(fStart + " -> " + fEnd);
        return max_sum;
    }
}
