
public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(answer1(arr));

    }
    //naive approach
    //tc is O(N)
    //sc is O(1)
    static int answer(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //we get the max, now again search for max ele, not equal to this max
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    //efficient method
    //tc is o(N)
    //sc is o(1)
    static int answer1(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
