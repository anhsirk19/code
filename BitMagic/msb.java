package BitMagic;
//to find the most significant bit
public class msb {
    public static void main(String[] args) {
        System.out.println(ans1(45));
    }
    static int ans(int n){
        return (int)Math.pow(2, logValue(n));
    }

    static int logValue(int n){//log2(n)
        int res = 0;
        while(n != 1){
            res++;
            n >>= 1;
        }
        return res;
    }

    static int ans1(int n) {
        return Integer.highestOneBit(n);
    }

    static int ans2(int n) {
        int msb = 0;
        while (n > 0) {
            msb = n;
            n = n & (n - 1); // Clear the least significant set bit
        }
        return msb;
    }
    //tc is o(1)
    static int getMSB(int n) {
        if (n == 0) return 0;
        int msb = (int)Math.pow(2, (int)(Math.log(n) / Math.log(2)));
        return msb;
    }
    

    //tc is o(1)
    static int getMSB2(int n) {
        n |= (n >> 1);
        n |= (n >> 2);
        n |= (n >> 4);
        n |= (n >> 8);
        n |= (n >> 16);
        return n ^ (n >> 1);
    }
}
