
//chck if the arr is sorted or not
public class checkSortedAsc {
    public static void main(String[] args) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        System.out.println(answer(arr));
    }
    static boolean answer(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
