package Mathematics;

public class addUnderModulo {
    public static void main(String[] args) {
        System.out.println(sumUnderModulo(1000000007, 1000000007));
    }
    public static long sumUnderModulo(long a, long b){
        final long MOD = 1000000007;
        long ans = ((a % MOD) + (b % MOD)) % MOD;
        return ans;
    } 
}
