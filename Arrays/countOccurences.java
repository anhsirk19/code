

public class countOccurences {
    public static void main(String[] args) {
        int[] arr = {1,4,5,5,5,5,7,9};
        int firstOcc = binary_search(arr, 10, true);
        int secondOcc = binary_search(arr, 10, false);
        if(firstOcc == -1){
            System.out.println("no target elment found");
            return;
        }
        System.out.println(secondOcc - firstOcc + 1);
    }
    static int binary_search(int[] arr, int target, boolean isFirst){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = end + (start - end)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
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
