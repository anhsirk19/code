package Mathematics;
//using iterative method to find cumputepower
public class iterativePower {
    public static void main(String[] args) {
        System.out.print(iterative(4, 5));
    }
    //o(log(n))
    static int iterative(int x, int n){
        int res = 1;
        while(n > 0){
            if(n%2 != 0){//n&1
                res = res*x;
            }
            x = x*x;
            n = n/2;//n>>1
        }
        return res;
    }
}
