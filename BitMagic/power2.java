package BitMagic;

public class power2 {
    public static void main(String[] args) {
        System.out.println(ans(8));
    }
    static boolean ans(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
}
