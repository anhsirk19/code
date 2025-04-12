public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20 };
        System.out.println(sum(arr, 4));
    }
    static int sum(int[] arr, int k){
        int n = arr.length;
        int curr_sum = 0;
        for(int i = 0 ; i < k ; i++){
            curr_sum += arr[i];
        }
        int max_sum = curr_sum;
        for(int i = k ; i < n ; i++){
            curr_sum += arr[i] - arr[i-k];
            max_sum = Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }
}
