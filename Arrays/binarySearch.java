public class binarySearch {
    //the array should be started
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,12,14};
        int index = binary_search(arr, 12);
        if(index != -1){
            System.out.println("index found at " + index);
            return;
        }
        System.out.println("element not found in the array");
    }

    //tc is o(logn), sc is o(1)
    static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = end + (start - end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        //if target is not found
        return -1;
    }
}
