import java.util.Arrays;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Arrays/problem/-rearrange-array-alternately-1587115620


public class rearrangeArrayAlternaticely {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    ////Use modulus and division trick to store two numbers in one array index.
    /// tc is o(n)
    /// //sc is o(1)
    public static void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int maxIndex = n-1;
        int minIndex = 0;
        int max_element = arr[n-1] + 1;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + (arr[maxIndex--] % max_element) * max_element;
            }else{
                arr[i] = arr[i] + (arr[minIndex++] % max_element) * max_element;
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = arr[i]/max_element;
        }
    }
}
