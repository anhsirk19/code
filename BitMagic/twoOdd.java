package BitMagic;

//to find to odd numbers in ana array
public class twoOdd {
    public static void main(String[] args) {
        int[] arr = {5,6,10,6,10,6,3,3};
        answer(arr);
    }
    //naive tc is o(N^2)

    //using xor
    //tc is o(N)
    static void answer(int[] arr){
        int xor = 0;
        for(int i = 1 ; i < arr.length ; i++){
            xor = xor^arr[i];
        }
        int k = xor & (~(xor-1));//to find the right most set bit
        int res1 = 0;
        int res2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if((arr[i] & k) != 0){
                res1 = res1 ^ arr[i];
            }else{
                res2 = res2 ^ arr[i];
            }
        }
        System.out.print(res1 + " " + res2);
    }
}
