package BitMagic;

public class longestConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(222));
    }
    //tc is o(logN)
    public static int maxConsecutiveOnes(int N) {
        int count = 0;
        int max_count = 0;
        while(N != 0){
            if((N & 1) == 1){
                count++;
                max_count = Math.max(count, max_count);
            }else{
                count = 0;
            }
            N >>= 1;
        }
        return max_count;
    }
}
