package Mathematics;

public class mulUnderModulo {
    public static void main(String[] args) {
        System.out.println(multiplicationUnderModulo(1000000007, 1000000007));
    }
    static long multiplicationUnderModulo(long a, long b)
    {
        final long MOD = 1000000007;
        
        long ans = ((a % MOD)*(b % MOD))%MOD;
        
        return ans;
    }
}
