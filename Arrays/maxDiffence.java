//given an array, find out max diff between any two elements,
//such that larger elment appears after smaller elment

//best time to buy and sell a stock uses same approach

public class maxDiffence {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,4,1,10};
        int ans = answer1(arr);
        if(ans == Integer.MIN_VALUE){
            System.out.println("array is in decreasing order");
            return;
        }
        System.out.println("max diff is " + ans);
    }
    //naive tc is O(n*n), sc is o(1)
    static int answer(int[] arr){
        int max_diff = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    max_diff = Math.max(max_diff, arr[j] - arr[i]);
                }
            }
        }
        return max_diff;
    }
    //tc is o(n), sc is o(1)
    static int answer1(int[] arr){
        int min = arr[0];
        int max_diff = Integer.MIN_VALUE;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > min){
                max_diff = Math.max(max_diff, arr[i] - min);
            }else{
                min = arr[i];
            }
        }
        return max_diff;
    }
}
