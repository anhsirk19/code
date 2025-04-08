import java.util.Arrays;

public class mergeSortTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1 ,3 ,4 ,6};
        int[] arr2 = {2 ,5 ,7 ,8};
        System.out.println(Arrays.toString(answer(arr1, arr2)));

    }
    //tc is o(m+n)
    //sc is o(m+n)
    static int[] answer(int[] arr1, int[] arr2){
        int[] mergeArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mergeArray[k++] = arr1[i++];
            }else{
                mergeArray[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            mergeArray[k++] = arr1[i++];
        }
        while(j < arr2.length){
            mergeArray[k++] = arr2[j++];
        }
        return mergeArray;
    }
}
