import java.util.Arrays;

public class insertArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4,-1,-1};
        insert(arr, 3, 4);
    }
    //tc is o(n), sc is o(1)
    static void insert(int[] arr, int pos, int element){
        int targetIndex = pos - 1;
        for(int i = arr.length - 1 ; i > targetIndex ; i--){
            arr[i] = arr[i-1];
        }
        arr[targetIndex] = element;
        System.out.println(Arrays.toString(arr));
    }
}
