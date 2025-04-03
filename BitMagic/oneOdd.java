package BitMagic;
//to find the one odd ocurring number in an array
public class oneOdd {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 4, 4, 4, 5, 5};
        System.out.println(answer1(arr));
    }
    //naive
    //tc is o(n*n)
    static int answer(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            int q = arr[i];
            int c = 0;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[j] == q){
                    c++;
                }
            }
            if(c % 2 != 0){
                return q;
            }
        }
        return -1; //not found any number
    }
    //efficent method using bitwise xor
    // tc is theeta(N)
    static int answer1(int[] arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
