public class equilibriumIndexArray {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(answer1(arr));
    }
    //naive solution
    //tc is o(n^2)
    //sc is 0(1)
    static int answer(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int leftSum = 0;
            for(int j = 0 ; j < i ; j++){
                leftSum += arr[i];
            }
            int rightSum = 0;
            for(int j = i+1 ; j < arr.length ; j++){
                rightSum += arr[j];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    //efficient
    //tc is o(n)
    //sc is o(n)
    static int answer1(int[] arr){
        int n = arr.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = arr[0];
        suffixSum[n-1] = arr[n-1];
        for(int i = 1 ; i < n ; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
            suffixSum[n-i-1] = arr[n-i-1] + suffixSum[n-i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(prefixSum[i] == suffixSum[i]){
                return i;
            }
        }
        return -1;
    }

    //optimised approach
    //tc is o(n)
    //sc is o(1)
    static int answer2(int[] arr){
        int totalSum = 0;
        for(int a : arr){
            totalSum += a;
        }
        int leftSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            totalSum = totalSum - arr[i];
            if(totalSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
