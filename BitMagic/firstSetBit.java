package BitMagic;

public class firstSetBit {
    public static void main(String[] args) {
        System.out.println(getFirstSetBit(12));
    }
    //tc is log(N)
    public static int getFirstSetBit(int n){
        int c = 1;
        while( n != 0){
            if((n & 1) == 1){
                return c;
            }
            c++;
            n = n >> 1;
        }
        return 0;
    }
}
