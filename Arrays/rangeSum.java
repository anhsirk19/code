public class rangeSum {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 5};
        System.out.println(answer1(arr, 0, 3));
    }
    //brute force
    //tc is o(N)
    //One-time use or only a few queries
    static int answer(int[] arr, int start, int end){
        if( start < 0 || end >= arr.length){
            System.out.println("not in array ranges");
            return -1;
        }
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum += arr[i];
        }
        return sum;
    }

    //using prefix sum
    //tc is 0(n), sc is o(n)
    //Multiple queries on the same array
    static int answer1(int[] arr, int start, int end){
        if( start < 0 || end >= arr.length){
            System.out.println("not in array ranges");
            return -1;
        }
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length ; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        if(start == 0){
            return prefixSum[end];
        }
        return prefixSum[end] - prefixSum[start-1];
    }
}
