public class largestElement {
    public static void main(String[] args) {
        int[] arr = {5, 8, 20, 15};
        System.out.println(answer(arr));

    }
    //naive approach
    //o(n*n)

    //opitmised 
    //tc is o(n), sc is o(1)
    static int answer(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
