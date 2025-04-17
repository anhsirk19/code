package BitMagic;

public class GrayToBinCode {
    public static void main(String[] args) {
        System.out.println(grayToBinary(15));
    }

    public static int grayToBinary(int n) {
        int res = n;
        while(n > 0){
            n >>= 1;
            res ^= n;
        }
        return res;
    }
}
