package Searching;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(answer(arr, 0));
    }
    static int answer(int[] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        //if target is not found
        return -1;
    }
}
