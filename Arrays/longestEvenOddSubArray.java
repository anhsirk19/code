public class longestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };
        System.out.println(answer(arr));
    }
    //tc is o(n^2),
    //sc is o(1)
    static int answer(int[] arr){
        int maxLen = 1;
        for(int i = 0 ; i < arr.length ; i++){
            int len = 1;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] % 2 == 0 && arr[j-1]%2 != 0 || arr[j] % 2 != 0 && arr[j-1]%2 == 0 ){
                    len++;
                }else{
                    break;
                }
            }
            maxLen = Math.max(maxLen, len);
        }

        if(maxLen == 0){
            return 0;
        }

        return maxLen;
    }
    //tc is o(n)
    //sc is o(1)
    static int answer1(int[] arr){
        int maxLen = 1;
        int len = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]% 2 == 0 && arr[i-1]%2 != 0 || arr[i] % 2 != 0 && arr[i-1]%2 == 0 ){
                len++;
                maxLen = Math.max(len, maxLen);
            }else{
                len = 1;
            }
        }
        if(maxLen == 0){
            return 0;
        }
        return maxLen;
    }
}
