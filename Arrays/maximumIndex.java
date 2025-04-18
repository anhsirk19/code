//Given an array arr of positive integers. The task is to return the maximum 
//of j - i subjected to the constraint of arr[i] < arr[j] and i < j.

public class maximumIndex {
    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(answer(arr));
    }

    //naive approach
    //tc is o(n^2)
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
    static int answer1(int[] arr){
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        leftMin[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            leftMin[i] = Math.min(arr[i], leftMin[i-1]);
        }
        rightMax[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        
        int i = 0, j = 0, max = -1;
        while(i < n && j < n){
            if(leftMin[i] <= rightMax[j]){
                max = Math.max(max, j-i);
                j++;
            }else{
                i++;
            }
        }
        return max;
    }
}
