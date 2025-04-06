public class lastOccurenceBS {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,6,7};
        int index = last_occurence(arr, 2);
        if(index != -1){
            System.out.println("index found at " + index);
            return;
        }
        System.out.println("element not found in the array");
    }
    //tc is o(logn), sc is o(1)
    static int last_occurence(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = end + (start - end)/2;
            if(arr[mid] == target){
                ans = mid;
                start = mid+1;//again search in left part of array for the target
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        //if target is not found
        return ans;
    }
}
