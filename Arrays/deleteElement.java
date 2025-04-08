import java.util.Arrays;

public class deleteElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        answer(arr, 7);
        System.out.println(Arrays.toString(arr));

    }
    static void answer(int[] arr, int element){
        int i;
        for(i = 0 ; i < arr.length ; i++){
            if(arr[i] == element){
                break;
            }
        }
        if(i == arr.length){
            System.out.println("element not found");
            return;
        }
        for(int j = i ; j < arr.length-1 ; j++){
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = -1;
    }
}
