package BitMagic;
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-BitMagic/problem/number-is-sparse-or-not-1587115620
public class sparseNumber {
    public static void main(String[] args) {
        System.out.println(isSparse1(11));
    }

    //tc is o(logn)
    public static boolean isSparse(int n)
    {
        int count = 0;
        int max_count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
                max_count = Math.max(count, max_count);
            }else{
                count = 0;
            }
            n >>= 1;
        }
        if(max_count > 1){
            return false;
        }
        return true;
    }

    //tc is o(1)
    //f n is sparse, then (n & (n >> 1)) == 0.by observation
    public static boolean isSparse1(int n)
    {
        return (n & (n >> 1)) == 0;
    }

}
