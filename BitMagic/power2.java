package BitMagic;

public class power2 {
    public static void main(String[] args) {
        System.out.println(ans(8));
    }
    //brian kerningums algo
    static boolean ans(int n){
        if(n == 0){
            return false;
        }
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
        //return (n && ((n & (n-1)) == 0))
    }
    static boolean answer(int n){
        if(n == 0){
            return false;
        }
        while(n != 0){
            int res = n % 2;
            if(res != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}
