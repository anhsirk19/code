//to remove duplicates from an sorted array


public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30,30};
        int n = answer(arr);
        for(int i = 0 ; i <= n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //tc is o(n)
    //sc is o(1)
    static int answer(int[] arr){
        int k = 0;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] != arr[k]){
                k++;
                arr[k] = arr[i];
            }
        }
        return k;
    }
}
