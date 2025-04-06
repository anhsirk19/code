public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,9,3,12,5};
        int index = linear_search(arr, 12);
        if(index != -1){
            System.out.println("index found at " + index);
            return;
        }
        System.out.println("element not found in the array");
    }


    //return index, if target is found otherwise return -1
    // tc O(n), sc O(1)
    static int linear_search(int[] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        //if target not found
        return -1;
    }
}
