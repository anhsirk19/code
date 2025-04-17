package BitMagic;

public class rightMostDiffBit {
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit1(52, 4));
    }
    //tc is O(log(min(m, n)))
    //it fails for m = 52, n = 4, as n stops before
    public static int posOfRightMostDiffBit(int m, int n) {
        if(m == n){
            return -1;
        }
        int ans = 1;
        
        while(m != 0 && n != 0){
            if((m & 1) != (n & 1)){
                break;
            }
            m = m >> 1;
            n = n >> 1;
            ans++;
        }
        return ans;
    }
    //tc is o(log(xor)), xor is atmost max(m, n)
    //tc is O(log(max(m, n)))

    public static int posOfRightMostDiffBit1(int m, int n) {
        if (m == n) return -1;

        int xor = m ^ n;
        int pos = 1;

        while ((xor & 1) == 0) {
            xor = xor >> 1;
            pos++;
        }

        return pos;
    }
}
