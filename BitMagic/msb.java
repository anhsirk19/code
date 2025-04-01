package BitMagic;

public class msb {
    public static void main(String[] args) {
        System.out.println(ans(45));
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
}
