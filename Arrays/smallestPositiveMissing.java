//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Arrays/problem/smallest-positive-missing-number-1587115621

public class smallestPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber1(arr));
    }
    //tc is o(n^2)
    public static int missingNumber(int[] arr) {
        int count = 1;
        while(true){
            boolean flag = false;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == count){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return count;
            }
            count++;
        }
    }

    //tc is o(n)
    public static int missingNumber1(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            while(arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]){
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != i + 1){
                return i+1;
            }
        }
        return n+1;//if all or inplace
    }

}
