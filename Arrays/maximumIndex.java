//Given an array arr of positive integers. The task is to return the maximum 
//of j - i subjected to the constraint of arr[i] < arr[j] and i < j.

public class maximumIndex {
    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(answer(arr));
    }

    //naive approach
    //tc is o(n)
    //sc is o(1)
    static int answer(int[] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[i] <= arr[j]){
                    max = Math.max(max, j-i);
                }
            }
        }
        return max;
    }

    //efficient approach
    //tc is o(n)
    //sc is o(n)
}
