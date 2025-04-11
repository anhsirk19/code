import java.util.Arrays;

public class meanAmedian {
    public static void main(String[] args) {
        int[] arr = {1, 2, 19, 28, 5};
        System.out.println(median(arr, arr.length));
        System.out.println(mean(arr, arr.length));
    }
    static int median(int A[],int N)
    {
      
       Arrays.sort(A);
       
       if(N % 2 != 0){
           return A[N/2];
       }
       return (int)(A[N/2] + A[N/2 - 1])/2;
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    static int mean(int A[],int N)
    {
       int sum = 0;
       for(int i = 0 ; i < N ; i++){
           sum = sum + A[i];
       }
       return (int)sum/N;
    }
}
